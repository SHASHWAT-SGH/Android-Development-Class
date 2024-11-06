package com.example.basics

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AlertExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alert_example)

        val btnExit = findViewById<Button>(R.id.btn_exit)

        btnExit.setOnClickListener {
            val alertBuilder = AlertDialog.Builder(this)
            alertBuilder.setTitle("Exit")
            alertBuilder.setMessage("Are you sure you want to exit?")
            alertBuilder.setCancelable(false)
            alertBuilder.setPositiveButton("Yes") { _, _ ->
                finish()
            }
            alertBuilder.setNegativeButton("No") { dialog, _ ->
                dialog.cancel()
            }

            alertBuilder.setNeutralButton("Show") {_, _ ->
                Toast.makeText(this, "You clicked neutral button", Toast.LENGTH_SHORT).show()
            }

            alertBuilder.create().show()
        }
    }
}