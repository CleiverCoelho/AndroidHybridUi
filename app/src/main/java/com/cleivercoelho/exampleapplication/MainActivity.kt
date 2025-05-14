package com.cleivercoelho.exampleapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cleivercoelho.exampleapplication.adapter.CardsAdapter
import com.cleivercoelho.exampleapplication.ui.theme.ExampleApplicationTheme

// Main Activity to display the RecyclerView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_xml_activity_layout)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Sample data
        val sampleData = listOf("my sample data")

        // Set the adapter
        recyclerView.adapter = CardsAdapter(this, sampleData)
    }
}

