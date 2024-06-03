package com.example.jetpack_compose_practise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField

//import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_practise.ui.theme.Jetpack_compose_practiseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Jetpack_compose_practiseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column (
                        modifier = Modifier.size(
                            height = 200.dp,
                            width = 200.dp
                        ).padding(
                            top = 20.dp,
                            start = 20.dp
                        ).background(color = Color.Cyan),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Greeting(name = "something")
                        TextInputField()
                    }
//
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Greeting(name: String = "Paras", modifier: Modifier = Modifier) {

    Button(
        onClick = {},
    ) {

        Text(text = "Some text ")
        Image(
            painter = painterResource(id = R.drawable.fail),
            contentDescription = "conter ks dkjvnfjk",
            contentScale = ContentScale.Fit,
            modifier = Modifier.height(50.dp)
//        colorFilter = ColorFilter.tint(Color.Blue)
        )

    }


    }


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TextInputField(modifier: Modifier = Modifier) { // Optional modifier for customization

    val textState = remember { mutableStateOf("") }

    TextField(
        value = textState.value,
        onValueChange = { newValue -> textState.value = newValue },
        label = { Text("Label Text") }, // Clear and concise label
        modifier = modifier // Apply optional modifier here
    )
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Jetpack_compose_practiseTheme {
        TextInputField()
    }
}