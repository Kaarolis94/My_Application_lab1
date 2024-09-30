package com.example.myapplication_lab1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
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

        // Find the Button and TextView by their IDs
        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.textView)

        // Set an OnClickListener on the Button
        button.setOnClickListener {
            // Change the text of the TextView when the Button is clicked
            textView.text = "Button Clicked!"
        }
    }
}
