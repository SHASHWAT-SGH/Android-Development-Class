package com.example.basics

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class LanguageSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_language_selection)

        val btnShowLang: Button = findViewById(R.id.btn_show_lang)

        btnShowLang.setOnClickListener {
            showLanguageSelectionDialog()
        }
    }

    private fun showLanguageSelectionDialog() {
        val languages = arrayOf("English", "Spanish", "French")
        val languageCodes = arrayOf("en", "es", "fr")
        val dialogView = LayoutInflater.from(this).inflate(R.layout.custom_dialog_select_lang, null)

        val alertDialog = AlertDialog.Builder(this)
            .setView(dialogView)
            .create()

        val languageListView: ListView = dialogView.findViewById(R.id.list_language)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languages)
        languageListView.adapter = adapter

        languageListView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedLanguage = languages[position]
            val selectedLanguageCode = languageCodes[position]
            setLocale(selectedLanguageCode)
            Toast.makeText(this, "Selected: $selectedLanguage", Toast.LENGTH_SHORT).show()
            alertDialog.dismiss()
        }

        alertDialog.show()
    }

    private fun setLocale(languageCode: String) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)

        val config = Configuration()
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.displayMetrics)
        recreate()
    }
}