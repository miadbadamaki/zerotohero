package com.example.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier
                    .fillMaxSize(),
                color = colorResource(R.color.black)
            ) {
                MainApp()
            }
        }
    }
}
@Composable
fun MainApp(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        QuoteCard(
            name = stringResource(R.string.writer_name),
            quote = stringResource(R.string.writer_quote),
            modifier = Modifier
                .padding(16.dp)
        )

    }
}
@Composable
fun QuoteCard(name: String,quote: String, modifier: Modifier= Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,

        ){
        Text(
            text = name,
            fontSize = 38.sp,
            color = colorResource(R.color.black),
            modifier = Modifier
                .background(color = colorResource(R.color.yellow))

        )
        Text(
            text = quote,
            fontSize = 30.sp,
            color = colorResource(R.color.black),
            modifier = Modifier
                .background(colorResource(R.color.white))
        )
    }
}
@Preview
@Composable
fun MainAppPreview(){
    MainApp()
}