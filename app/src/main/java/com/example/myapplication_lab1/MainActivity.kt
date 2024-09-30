package com.example.myapplication_lab1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the Buttons and TextView by their IDs
        val button: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)
        val textView: TextView = findViewById(R.id.textView)

        // Set an OnClickListener on the first Button
        button.setOnClickListener {
            // Change the text of the TextView when the first Button is clicked
            textView.text = "Button Clicked!"
        }

        // Set an OnClickListener on the second Button
        button2.setOnClickListener {
            // Change the text color of the TextView when the second Button is clicked
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }
    }
}
