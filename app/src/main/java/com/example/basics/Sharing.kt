package com.example.basics

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Sharing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_shariing)

        val btnShare = findViewById<Button>(R.id.btnShare)

        btnShare.setOnClickListener {
            share("Hey, this is a test")
        }
    }

    private fun share(txt: String){
        val intent = Intent().apply {
            action = Intent.ACTION_SEND
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, txt)
        }

        val chooser1 = Intent.createChooser(intent, "Share Via")
        startActivity(chooser1)
    }
}