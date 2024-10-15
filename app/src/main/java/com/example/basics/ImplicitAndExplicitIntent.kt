package com.example.basics

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

/*
ACTION_VIEW
ACTION_SEND
ACTION_STATIC
 */

class ImplicitAndExplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit_and_explicit_intent)

        val btnExplicitIntent = findViewById<Button>(R.id.btnExplicitIntent)
        val btnImplicitIntent = findViewById<Button>(R.id.btnImplicitIntent)

        btnExplicitIntent.setOnClickListener {
            val intent = Intent(this, ExplicitIntentPage::class.java)
            startActivity(intent)
        }

        btnImplicitIntent.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://google.co.in/")
            startActivity(intent)



        }

    }
}