package com.example.basics

import android.os.Bundle
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PopUpMenuExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pop_up_menu_example)

        val btnPopup: Button = findViewById(R.id.btn_popup)

        btnPopup.setOnClickListener {
            val p2 = PopupMenu(this, btnPopup)
            val m1: MenuInflater = p2.menuInflater
            m1.inflate(R.menu.pop_up_menu, p2.menu)

            p2.setOnMenuItemClickListener { item: MenuItem ->
                when (item.itemId) {
                    R.id.pop_up_menu_item_1 -> {
                        Toast.makeText(this, "Show", Toast.LENGTH_SHORT).show()
                        true
                    }

                    R.id.pop_up_menu_item_2 -> {
                        Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> {
                        false
                    }
                }
            }

            p2.show()
        }
    }
}