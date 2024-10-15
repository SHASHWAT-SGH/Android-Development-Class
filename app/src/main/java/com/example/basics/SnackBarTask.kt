package com.example.basics

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar

class SnackBarTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snack_bar_task)

        val card1 = findViewById<ImageButton>(R.id.card1)
        val card2 = findViewById<ImageButton>(R.id.card2)
        val card3 = findViewById<ImageButton>(R.id.card3)
        val card4 = findViewById<ImageButton>(R.id.card4)
        val card5 = findViewById<ImageButton>(R.id.card5)
        val card6 = findViewById<ImageButton>(R.id.card6)
        val card7 = findViewById<ImageButton>(R.id.card7)
        val card8 = findViewById<ImageButton>(R.id.card8)
        val card9 = findViewById<ImageButton>(R.id.card9)

        card1.setOnClickListener {view ->
            val snackBar = Snackbar.make(view, "Visit School of Architecture", Snackbar.LENGTH_LONG).setAction("visit"){
                val intent = Intent(this, SnackBarTaskDetails::class.java)
                intent.putExtra("department", "Architecture")
                intent.putExtra("image", R.drawable.img_lpu_arch)
                startActivity(intent)
            }
            snackBar.show()
        }

        card2.setOnClickListener {view ->
            Snackbar.make(view, "Visit School of Civil Engineering", Snackbar.LENGTH_LONG).setAction("visit"){
                val intent = Intent(this, SnackBarTaskDetails::class.java)
                intent.putExtra("department", "Civil Engineering")
                intent.putExtra("image", R.drawable.img_lpu_civil)
                startActivity(intent)
            }.show()
        }

        card3.setOnClickListener {view ->
            Snackbar.make(view, "Visit School of Polytechinque", Snackbar.LENGTH_LONG).setAction("visit"){
                val intent = Intent(this, SnackBarTaskDetails::class.java)
                intent.putExtra("department", "Polytechinque")
                intent.putExtra("image", R.drawable.img_lpu_poly)
                startActivity(intent)
            }.show()
        }

        card4.setOnClickListener {view ->
            Snackbar.make(view, "Visit School of Agriculture", Snackbar.LENGTH_LONG).setAction("visit"){
                val intent = Intent(this, SnackBarTaskDetails::class.java)
                intent.putExtra("department", "Agriculture")
                intent.putExtra("image", R.drawable.img_lpu_agri)
                startActivity(intent)
            }.show()
        }

        card5.setOnClickListener {view ->
            Snackbar.make(view, "Visit School of Bio Sciences", Snackbar.LENGTH_LONG).setAction("visit"){
                val intent = Intent(this, SnackBarTaskDetails::class.java)
                intent.putExtra("department", "Bio Sciences")
                intent.putExtra("image", R.drawable.img_lpu_bio)
                startActivity(intent)
            }.show()
        }

        card6.setOnClickListener {view ->
            Snackbar.make(view, "Visit School of Law", Snackbar.LENGTH_LONG).setAction("visit"){
                val intent = Intent(this, SnackBarTaskDetails::class.java)
                intent.putExtra("department", "Law")
                intent.putExtra("image", R.drawable.img_lpu_law)
                startActivity(intent)
            }.show()
        }

        card7.setOnClickListener {view ->
            Snackbar.make(view, "Visit School of Computer Science", Snackbar.LENGTH_LONG).setAction("visit"){
                val intent = Intent(this, SnackBarTaskDetails::class.java)
                intent.putExtra("department", "Computer Science")
                intent.putExtra("image", R.drawable.img_lpu_cse)
                startActivity(intent)
            }.show()
        }

        card8.setOnClickListener {view ->
            Snackbar.make(view, "Visit School of Design", Snackbar.LENGTH_LONG).setAction("visit"){
                val intent = Intent(this, SnackBarTaskDetails::class.java)
                intent.putExtra("department", "Design")
                intent.putExtra("image", R.drawable.img_lpu_design)
                startActivity(intent)
            }.show()
        }

        card9.setOnClickListener {view ->
            Snackbar.make(view, "Visit School of Mechanical", Snackbar.LENGTH_LONG).setAction("visit"){
                val intent = Intent(this, SnackBarTaskDetails::class.java)
                intent.putExtra("department", "Mechanical")
                intent.putExtra("image", R.drawable.img_lpu_mechanical)
                startActivity(intent)
            }.show()
        }
    }
}