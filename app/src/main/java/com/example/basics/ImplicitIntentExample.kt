package com.example.basics

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImplicitIntentExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inplicit_intent_example)

        val btnOpenUrl = findViewById<Button>(R.id.btn_open_url)
        val btnOpenDial = findViewById<Button>(R.id.btn_open_dial)
        val btnOpenGallery = findViewById<Button>(R.id.btn_open_gallery)
        val btnOpenCamera = findViewById<Button>(R.id.btn_open_camera)
        val btnOpenMessages = findViewById<Button>(R.id.btn_open_messages)
        val btnOpenCalLog = findViewById<Button>(R.id.btn_open_call_log)
        val btnOpenYoutube = findViewById<Button>(R.id.btn_open_youtube)
        val btnOpenGmail = findViewById<Button>(R.id.btn_open_gmail)

        btnOpenUrl.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(intent)
        }

        btnOpenDial.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234567890"))
            startActivity(intent)
        }

        btnOpenGallery.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"))
            startActivity(intent)
        }

        btnOpenCamera.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        btnOpenMessages.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:1234567890"))
            intent.putExtra("sms_body", "Hello there!")
            startActivity(intent)
        }

        btnOpenCalLog.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://call_log/calls"))
            startActivity(intent)
        }

        btnOpenYoutube.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"))
            startActivity(intent)
        }

        btnOpenGmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"))
            startActivity(intent)
        }
    }
}