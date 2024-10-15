package com.example.basics

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ca)
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            val toast = Toast.makeText(this, "Welcome Back", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}