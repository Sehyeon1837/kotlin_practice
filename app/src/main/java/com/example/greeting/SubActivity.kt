package com.example.greeting

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.greeting.ui.theme.GreetingTheme

class SubActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.sec_activity)
        val finButton = findViewById<Button>(R.id.btn_Finish)

        val receivedIntent = getIntent()
        val receivedMessage = receivedIntent.getStringExtra("message")

        val textReiceved = findViewById<EditText>(R.id.recieveplainText)
        textReiceved.setText(receivedMessage)

        finButton.setOnClickListener {
            val resultMessage = textReiceved.text.toString()
            //receivedIntent.putExtra("message", resultMessage)
            //setResult(0, receivedIntent)
            finish()
        }
    }
}