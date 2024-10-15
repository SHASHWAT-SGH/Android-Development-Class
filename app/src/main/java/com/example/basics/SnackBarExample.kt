package com.example.basics

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar


class SnackBarExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snack_bar_example)

        val snackBtn = findViewById<Button>(R.id.btnSnack)
        snackBtn.setOnClickListener{view ->
            Snackbar.make(view,"This is a simple snackbar",Snackbar.LENGTH_LONG).setAction("undo"){
                Toast.makeText(this,"Undo CLicked",Toast.LENGTH_LONG).show()
            }.show()
        }
    }
}