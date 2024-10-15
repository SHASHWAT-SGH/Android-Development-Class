package com.example.basics

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LogCatExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_log_cat_example)
        val btnLog = findViewById<Button>(R.id.btnLog)
        btnLog.setOnClickListener {
            Log.v(TAG, "Verbose log: lowest priority, detailed entry, no use during the production")
            Log.d(TAG, "Debug log: highest priority, This is used to debug the app")
            Log.i(TAG, "Info log: moderate level importance, they provide us with contextual information")
            Log.w(TAG, "Warning log: This is a warning message or unexpected behaviour, but it is not an error")
            Log.e(TAG, "Error log: used for logging error messages, app will not work correctly")
        }

    }
}