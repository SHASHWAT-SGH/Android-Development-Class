package com.example.basics

import android.content.Intent
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CA2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ca2)

        val btn = findViewById<Button>(R.id.btn)
        val editTextName = findViewById<EditText>(R.id.edit_text_name)
        val editTextGender = findViewById<EditText>(R.id.edit_text_gender)

        btn.setOnClickListener {
            Log.d(TAG, "Button Clicked")
            val intent = Intent(this, Welcome::class.java)
            intent.putExtra("name", editTextName.text.toString())
            intent.putExtra("gender", editTextGender.text.toString())
            startActivity(intent)
        }
    }
}