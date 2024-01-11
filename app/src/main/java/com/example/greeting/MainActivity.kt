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
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.greeting.adapter.LocationAdapter
import com.example.greeting.data.Location
import com.example.greeting.data.createRealJejuLocationData
import com.example.greeting.ui.theme.GreetingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recylce_exam)

        //recyclerview 인스턴스 가져오기
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView2)

        //layoutmanager 설정
        recyclerView.layoutManager = LinearLayoutManager(this)

        //adapter 설정
        val locationAdapter = LocationAdapter(sampleLocation)
        recyclerView.adapter = locationAdapter
    }
}

val sampleLocation = createRealJejuLocationData()
