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
public fun calc() {
//    Text("Hello")

    //Spacer(modifier = Modifier.width(20.dp))
    Column(
        modifier = Modifier.fillMaxSize(),
        //verticalArrangement = Arrangement.Center,
        //horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Here all the UI elements will be stacked below each other
        //Text("Calculator App", style = MaterialTheme.typography.headlineLarge)

        Row() {
            //Text("Hello")
            Button(onClick = {}) {
                Text("7")
            }
        }
        Row() {
            Button(onClick = {}) {
                Text("4")
            }
        }
        Row() {
            Button(onClick = {}) {
                Text("1")
            }
        }

        Row() {
            Button(onClick = {}) {
                Text("0")
            }
        }

    }

    //Spacer(modifier = Modifier.width(20.dp))

    Column(
        modifier = Modifier.fillMaxSize(),
        //verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Here all the UI elements will be stacked below each other
        //Text("Calculator App", style = MaterialTheme.typography.headlineLarge)

        Row() {
            //Text("Hello")
            Button(onClick = {}) {
                Text("8")
            }
        }
        Row() {
            Button(onClick = {}) {
                Text("5")
            }
        }
        Row() {
            Button(onClick = {}) {
                Text("2")
            }
        }
        Row() {
            Button(onClick = {}) {
                Text(".")
            }
        }

    }

    //Spacer(modifier = Modifier.width(20.dp))

    Column(
        modifier = Modifier.fillMaxSize(),
        //verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.End
    ) {

        // Here all the UI elements will be stacked below each other
        //Text("Calculator App", style = MaterialTheme.typography.headlineLarge)

        Row() {
            //Text("Hello")
            Button(onClick = {}) {
                Text("9")
            }
        }
        Row() {
            Button(onClick = {}) {
                Text("6")
            }
        }
        Row() {
            Button(onClick = {}) {
                Text("3")
            }
        }
        Row() {
            Button(onClick = {}) {
                Text("=")
            }
        }

    }

//    Column() {
//        Text("A")
//    }
//
//    Column() {
//        Text("B")
//    }
//
//    Column() {
//        Text("C")
//    }
}