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
@Composable
fun calc() {

    var input by remember{mutableStateOf("")}
    var output by remember{mutableStateOf("")}

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
            Button(onClick = {input = input.dropLast(1)}, modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("Del")
            }
            Button(onClick = {
                input = ""
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
                    if (lastChar == '+' || lastChar == '-' || lastChar == 'x' || lastChar == '/')
                        input = input.dropLast(1)
                }
                input += "x"
                             },
                modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("x")
            }
            Button(onClick = {
                val length = input.length - 1
                if (input.isNotEmpty()) {
                    val lastChar = input.last()
                    if (lastChar == '+' || lastChar == '-' || lastChar == 'x' || lastChar == '/')
                        input = input.dropLast(1)
                }
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
                val length = input.length - 1
                if (input.isNotEmpty()) {
                    val lastChar = input.last()
                    if (lastChar == '+' || lastChar == '-' || lastChar == 'x' || lastChar == '/')
                        input = input.dropLast(1)
                }
                input += "+"
            },
                modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("+")
            }
            Button(onClick = {
                val length = input.length - 1
                if (input.isNotEmpty()) {
                    val lastChar = input.last()
                    if (lastChar == '+' || lastChar == '-' || lastChar == 'x' || lastChar == '/')
                        input = input.dropLast(1)
                }
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
            Button(onClick = {input += 0}, modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text("0")
            }
            Button(onClick = {input += "."}, modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text(".")
            }
            Button(onClick = {input += "="}, modifier = Modifier.weight(1f).fillMaxHeight()) {
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