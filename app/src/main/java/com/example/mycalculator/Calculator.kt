package com.example.mycalculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun calc() {

    //Spacer(modifier = Modifier.width(20.dp))
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {

        // Here all the UI elements will be stacked below each other
        //Text("Calculator App", style = MaterialTheme.typography.headlineLarge)

        Row() {
            Button(onClick = {}) {
                Text("7")
            }
            Button(onClick = {}) {
                Text("8")
            }
            Button(onClick = {}) {
                Text("9")
            }
            Button(onClick = {}) {
                Text("Del")
            }
            Button(onClick = {}) {
                Text("Clear")
            }

        }
        Row() {
            Button(onClick = {}) {
                Text("4")
            }
            Button(onClick = {}) {
                Text("5")
            }
            Button(onClick = {}) {
                Text("6")
            }
            Button(onClick = {}) {
                Text("x")
            }
            Button(onClick = {}) {
                Text("/")
            }
        }
        Row() {
            Button(onClick = {}) {
                Text("1")
            }
            Button(onClick = {}) {
                Text("2")
            }
            Button(onClick = {}) {
                Text("3")
            }
            Button(onClick = {}) {
                Text("+")
            }
            Button(onClick = {}) {
                Text("-")
            }
        }

        Row() {
            Button(onClick = {}) {
                Text("0")
            }
            Button(onClick = {}) {
                Text(".")
            }
            Button(onClick = {}) {
                Text("=")
            }
            Button(onClick = {}) {
                Text("(")
            }
            Button(onClick = {}) {
                Text(")")
            }
        }

    }



}