package com.example.mycalculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Composable
fun calc() {

    var input = ""

    Column(
        modifier = Modifier.fillMaxSize(),
    ) {

        // Here all the UI elements will be stacked below each other
        //Text("Calculator App", style = MaterialTheme.typography.headlineLarge)
        Spacer(modifier = Modifier.height(200.dp))
        Row() {
            Button(onClick = { input += 7 }) {
                Text("7")
            }
            Button(onClick = { input += 8 }) {
                Text("8")
            }
            Button(onClick = {input += 9}) {
                Text("9")
            }
            Button(onClick = {input = input.dropLast(1)}) {
                Text("Del")
            }
            Button(onClick = {input = ""}) {
                Text("Clear")
            }

        }
        Row() {
            Button(onClick = {input += 4}) {
                Text("4")
            }
            Button(onClick = {input += 5}) {
                Text("5")
            }
            Button(onClick = {input += 6}) {
                Text("6")
            }
            Button(onClick = {input += "x"}) {
                Text("x")
            }
            Button(onClick = {input += "/"}) {
                Text("/")
            }
        }
        Row() {
            Button(onClick = {input += 1}) {
                Text("1")
            }
            Button(onClick = {input += 2}) {
                Text("2")
            }
            Button(onClick = {input += 3}) {
                Text("3")
            }
            Button(onClick = {input += "+"}) {
                Text("+")
            }
            Button(onClick = {input += "-"}) {
                Text("-")
            }
        }

        Row() {
            Button(onClick = {input += 0}) {
                Text("0")
            }
            Button(onClick = {input += "."}) {
                Text(".")
            }
            Button(onClick = {input += "="}) {
                Text("=")
            }
            Button(onClick = {input += "("}) {
                Text("(")
            }
            Button(onClick = {input += ")"}) {
                Text(")")
                
            }
        }

    }



}