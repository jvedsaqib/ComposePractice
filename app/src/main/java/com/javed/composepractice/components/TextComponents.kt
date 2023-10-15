package com.javed.composepractice.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun simpleText(msg : String){
    Text(text = msg)
}

@Composable
fun simpleTextSmall(msg : String){
    Text(
        text = msg,
        Modifier.size(8.dp)
    )
}

@Preview
@Composable
fun prev(){
    Column(){
        simpleText(msg = "Hello")
        simpleTextSmall(msg = "Hi")
    }
}