package com.javed.composepractice.components

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun simpleText(msg : String){
    Text(text = msg)
}

@Preview
@Composable
fun prev(){
    simpleText(msg = "Hello")
}