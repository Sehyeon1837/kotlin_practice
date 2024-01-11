package com.example.greeting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.greeting.ui.theme.GreetingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
/*        setContent {
            GreetingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Kotlin")
                }
            }
        }*/

        setContentView(R.layout.first_activity)
        val sendButton = findViewById<Button>(R.id.btn_startActivity)

        sendButton.setOnClickListener{
            val sendText = findViewById<EditText>(R.id.sendPlainText)
            val sendMessage = sendText.text.toString()

            val sendIntent = Intent(this, SubActivity::class.java)
            sendIntent.putExtra("message", sendMessage)

            startActivity(sendIntent)

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingTheme {
        Greeting("Kotlin")
    }
}