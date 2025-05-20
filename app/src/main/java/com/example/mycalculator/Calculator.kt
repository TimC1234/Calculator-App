package com.example.mycalculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


//@Composable
//fun displayResult(input: String) {
//    Text("Result: $input")
//}

//fun calculateResult(input: String, operators: String): String {
//
////    var currentOperator = operators.first()
////    var currentOperatorIndex = input.indexOf(currentOperator)
//    var ops = operators
//    var currentOperator = ""             // determines what the left most operator is
//    var currentOperatorIndex = 0
//    var nextOperator = ""
//    var nextOpInd = 0
//
//    var result = 0                       // final result
//    var op1Str = ""                      // left hand side operand
//    var op2Str = ""                      // right hand side operand
//    var op1Int = 0
//    var op2Int = 0
//
//    var start = 0                        // current index position
//
//    if (ops.isEmpty()) {
//        return input
//    }
//
//    val length = ops.length
//    while (ops.isNotEmpty()) {
//        currentOperator = ops.first().toString()
//        currentOperatorIndex = input.indexOf(currentOperator, start)
//
//
//
//
//        op1Str = input.substring(start, currentOperatorIndex)
//        op2Str = input.substring(currentOperatorIndex + 1)
//
//        op1Int = op1Str.toInt()
//        op2Int = op2Str.toInt()
//
//        ops = ops.drop(1)
//        nextOperator = ops.first().toString()
//        nextOpInd = input.indexOf(nextOperator, )
//
//        if (currentOperator == "/" && op2Int == 0) {
//            return "Math Error: Division by 0"
//        }
//
//        result = when (currentOperator) {
//            "+" -> op1Int + op2Int
//            "-" -> op1Int - op2Int
//            "x" -> op1Int * op2Int
//            "/" -> op1Int / op2Int
//            else -> 0
//        }
//
//
//        break
//    }
//
//    return result.toString()
//}

fun calculateResult(input: String, operators: String): String {
    var expr = input
    var ops = operators

    while (ops.isNotEmpty()) {
        val op = ops.first().toString()
        val opIndex = expr.indexOf(op)

        if (opIndex == -1) return expr

        // Find left operand
        val left = expr.substring(0, opIndex)
        val right = expr.substring(opIndex + 1)

        // If there's another operator after this one, trim the right side
        val nextOps = listOf("+", "-", "x", "/")
        val nextOpIndex = right.indexOfAny(nextOps)

        val op1Str = left
        val op2Str = if (nextOpIndex != -1) right.substring(0, nextOpIndex) else right
        val remaining = if (nextOpIndex != -1) right.substring(nextOpIndex) else ""

        val op1 = op1Str.toIntOrNull() ?: return "Error"
        val op2 = op2Str.toIntOrNull() ?: return "Error"

        if (op == "/" && op2 == 0) return "Math Error: Division by 0"

        val result = when (op) {
            "+" -> op1 + op2
            "-" -> op1 - op2
            "x" -> op1 * op2
            "/" -> op1 / op2
            else -> return "Error"
        }

        // Build new expression string
        expr = result.toString() + remaining
        ops = ops.drop(1)
    }

    return expr
}


@Composable
fun calc() {

    var input by remember{mutableStateOf("")}
    var output by remember{mutableStateOf("")}
    var operators by remember{mutableStateOf("")}

    Column(
        modifier = Modifier.fillMaxSize(),
    ) {

        Spacer(modifier = Modifier.height(100.dp))
        Text("Input: $input", style = MaterialTheme.typography.headlineLarge)

        Spacer(modifier = Modifier.height(50.dp))
        Text("Output: $output", style = MaterialTheme.typography.headlineLarge)

        Spacer(modifier = Modifier.height(200.dp))
        Row(
            modifier = Modifier.fillMaxWidth().height(80.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
            Button(onClick = { input += 7 }, modifier = Modifier.weight(1f).fillMaxHeight()
            ) {
                Text("7")
            }
            Button(onClick = { input += 8 }, modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("8")
            }
            Button(onClick = {input += 9}, modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("9")
            }
            Button(onClick = {
                val lastChar = input.last()
                if (lastChar == operators.last()) {
                    operators = operators.dropLast(1)
                }
                input = input.dropLast(1)
                             },
                modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("Del")
            }
            Button(onClick = {
                input = ""
                operators = ""
                             },
                modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("AC")
            }

        }
        Row(
            modifier = Modifier.fillMaxWidth().height(80.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Button(onClick = {input += 4}, modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("4")
            }
            Button(onClick = {input += 5}, modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("5")
            }
            Button(onClick = {input += 6}, modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("6")
            }
            Button(onClick = {
                if (input.isNotEmpty()) {
                    val lastChar = input.last()
                    // checks if the previous input was an operator and overwrites it if true
                    if (lastChar == '+' || lastChar == '-' || lastChar == 'x' || lastChar == '/') {
                        input = input.dropLast(1)
                        operators = operators.dropLast(1)
                    }
                }
                operators += "x"
                input += "x"
                             },
                modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("x")
            }
            Button(onClick = {
                if (input.isNotEmpty()) {
                    val lastChar = input.last()
                    // checks if the previous input was an operator and overwrites it if true
                    if (lastChar == '+' || lastChar == '-' || lastChar == 'x' || lastChar == '/') {
                        input = input.dropLast(1)
                        operators = operators.dropLast(1)
                    }
                }
                operators += "/"
                input += "/"
            },
                modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("/")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth().height(80.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Button(onClick = {input += 1}, modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("1")
            }
            Button(onClick = {input += 2}, modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("2")
            }
            Button(onClick = {input += 3}, modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("3")
            }
            Button(onClick = {
                if (input.isNotEmpty()) {
                    val lastChar = input.last()
                    // checks if the previous input was an operator and overwrites it if true
                    if (lastChar == '+' || lastChar == '-' || lastChar == 'x' || lastChar == '/') {
                        input = input.dropLast(1)
                        operators = operators.dropLast(1)
                    }
                }
                operators += "+"
                input += "+"
            },
                modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("+")
            }
            Button(onClick = {
                if (input.isNotEmpty()) {
                    val lastChar = input.last()
                    // checks if the previous input was an operator and overwrites it if true
                    if (lastChar == '+' || lastChar == '-' || lastChar == 'x' || lastChar == '/') {
                        input = input.dropLast(1)
                        operators = operators.dropLast(1)
                    }
                }
                operators += "-"
                input += "-"
            },
                modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("-")
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth().height(80.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Button(onClick = {
                if (input.isNotEmpty())
                    input += 0
                             },
                modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("0")
            }
            Button(onClick = {input += "."}, modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text(".")
            }
            Button(onClick = {
                //input += "="
                output = calculateResult(input, operators)
                             },
                modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("=")
            }
            Button(onClick = {input += "("}, modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("(")
            }
            Button(onClick = {input += ")"}, modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text(")")
                
            }
        }


    }



}