package com.example.basics

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RatingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rating_page)

        val btnRatingBar = findViewById<Button>(R.id.btn_rating_bar)
        val ratingBar = findViewById<RatingBar>(R.id.rating_bar)
    }
}