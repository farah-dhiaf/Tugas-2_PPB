package com.example.happybday

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybday.ui.theme.HappyBdayTheme
import androidx.compose.ui.graphics.Color


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFFFDAB9)
                ) {
                    GreetingText(message = "Happy birthday, Farah!", from = "From: Mom")
                }
            }
        }
    }
}

@Composable
fun FancyButton(text: String){}

@Composable
fun BackButtonHandler(){}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "my preview"
    )
@Composable
fun GreetingPreview() {
    HappyBdayTheme{
       GreetingText(message = "Android", from = "Android")
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier=Modifier){
    Column {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp
        )

        Text(
            text = from,
            fontSize = 36.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BdayCardPreview(){
    HappyBdayTheme {
        GreetingText(message = "Happy birthday, Farah!", from = "From: Mom")
    }
}