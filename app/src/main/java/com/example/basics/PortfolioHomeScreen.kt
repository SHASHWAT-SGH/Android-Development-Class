package com.example.basics

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PortfolioHomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_portfolio_home_screen)

        val toolBar = findViewById<Toolbar>(R.id.portfolio_toolbar)
        setSupportActionBar(toolBar)

//        github and linkedin
        val btnGithub = findViewById<androidx.cardview.widget.CardView>(R.id.btn_github)
        val btnLinkedin = findViewById<androidx.cardview.widget.CardView>(R.id.btn_linkedin)

        btnGithub.setOnClickListener {
            val p2 = PopupMenu(this, btnGithub)
            val m1: MenuInflater = p2.menuInflater
            m1.inflate(R.menu.portfolio_popup_menu, p2.menu)

            p2.setOnMenuItemClickListener { item: MenuItem ->
                when (item.itemId) {
                    R.id.portfolio_popup_menu_1 -> {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/SHASHWAT-SGH"))
                        startActivity(intent)
                        true
                    }

                    R.id.portfolio_popup_menu_2 -> {
                        false
                    }
                    else -> {
                        false
                    }
                }
            }

            p2.show()
        }

        btnLinkedin.setOnClickListener {
            val p2 = PopupMenu(this, btnLinkedin)
            val m1: MenuInflater = p2.menuInflater
            m1.inflate(R.menu.portfolio_popup_menu, p2.menu)

            p2.setOnMenuItemClickListener { item: MenuItem ->
                when (item.itemId) {
                    R.id.portfolio_popup_menu_1 -> {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/shashwat11/"))
                        startActivity(intent)
                        true
                    }

                    R.id.portfolio_popup_menu_2 -> {
                        false
                    }
                    else -> {
                        false
                    }
                }
            }

            p2.show()
        }

//        see all
        val btnSeeAll = findViewById<Button>(R.id.btn_see_all)
        btnSeeAll.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://shashwat-portfolio-11.netlify.app/"))
            startActivity(intent)
        }

//        projects
        val btnAmigo = findViewById<androidx.cardview.widget.CardView>(R.id.project_amigo)
        val btnSoil = findViewById<androidx.cardview.widget.CardView>(R.id.project_soil)
        val btnRetro = findViewById<androidx.cardview.widget.CardView>(R.id.project_retro)

        btnAmigo.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=app.amigo.app&hl=en-US"))
            startActivity(intent)
        }

        btnSoil.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://soilsustain.netlify.app/"))
            startActivity(intent)
        }

        btnRetro.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://retro-bazaar.onrender.com/"))
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.protfolio_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.menu_email -> {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:vnsshashwat@gmail.com"))
                startActivity(intent)
                true
            }

            R.id.menu_contact -> {
                val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234567890"))
                startActivity(intent)
                true
            }

            R.id.menu_feedback -> {
                val intent = Intent(this, PortfolioFeedbackScreen::class.java)
                startActivity(intent)
                true
            }

            R.id.menu_exit -> {
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

                alertBuilder.create().show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}