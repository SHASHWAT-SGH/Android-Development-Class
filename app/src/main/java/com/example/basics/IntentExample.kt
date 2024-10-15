package com.example.basics

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class IntentExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intent_example)
        val loginButton = findViewById<Button>(R.id.button2);
        loginButton.setOnClickListener {
            var i = Intent(this, LoginSuccess::class.java)
            startActivity(i)
        }
    }
}