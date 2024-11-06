package com.example.basics

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RatingApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rating_app)

        val btnExit = findViewById<Button>(R.id.btn_rating)

        btnExit.setOnClickListener {
            val alertBuilder = AlertDialog.Builder(this)
            alertBuilder.setTitle("Rating")
            alertBuilder.setMessage("Do you want to rate us?")
            alertBuilder.setCancelable(false)
            alertBuilder.setPositiveButton("Yes") { dialog, _ ->
                dialog.cancel()
            }
            alertBuilder.setNegativeButton("No") { _, _ ->
                finish()

            }

            alertBuilder.setNeutralButton("Remind me later") {_, _ ->
                Toast.makeText(this, "You will be remind after 24 hours", Toast.LENGTH_SHORT).show()
            }

            alertBuilder.create().show()
        }

    }
}