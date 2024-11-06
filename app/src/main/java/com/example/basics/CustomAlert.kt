package com.example.basics

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CustomAlert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_alert)

        val btnSubscribe = findViewById<Button>(R.id.btn_subscribe)

        btnSubscribe.setOnClickListener {
            var customAlert = LayoutInflater.from(this).inflate(R.layout.custom_dialogue_box, null)
            val alertBuilder = AlertDialog.Builder(this).setView(customAlert)

            alertBuilder.setPositiveButton("Subscribe") { dialog, _ ->
                val dialogEditText = customAlert.findViewById<EditText>(R.id.dialogue_edit_text)
                val emailText = dialogEditText.text.toString()

                if (emailText.isNotBlank()) {
                    Toast.makeText(this, "subscribed with $emailText", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "enter valid email", Toast.LENGTH_LONG).show()
                }
                dialog.dismiss()
            }

            alertBuilder.setNegativeButton("Cancel") { dialog, _ ->
                dialog.cancel()
            }

            alertBuilder.create().show()
        }


    }
}