package com.example.basics

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

        val textName = findViewById<TextView>(R.id.text_name)
        val textGender = findViewById<TextView>(R.id.text_gender)

        textName.setText(intent.getStringExtra("name"))
        textGender.setText(intent.getStringExtra("gender"))

        Toast.makeText(this, "Data Received Successfully", Toast.LENGTH_LONG).show()
    }
}