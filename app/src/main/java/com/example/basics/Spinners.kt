package com.example.basics

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Spinners : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_spinners)
        val destinationSpinner: Spinner = findViewById(R.id.spinner)
        val packageListView: ListView = findViewById(R.id.listView)
        val destinations = arrayOf("Paris", "London", "New York", "Tokyo", "Sydney", "Varanasi")
        val packagesOfParis = arrayOf("Eiffel Tower", "Louvre Museum", "Montmartre")
        val packagesOfLondon = arrayOf("Big Ben", "Tower Bridge", "Buckingham Palace")
        val packagesOfNewYork = arrayOf("Statue of Liberty", "Empire State Building", "Brooklyn Bridge")
        val packagesOfTokyo = arrayOf("Tokyo Skytree", "Tokyo Disneyland", "Tokyo Imperial Palace")
        val packagesOfSydney = arrayOf("Sydney Opera House", "Sydney Harbour Bridge", "Sydney National Museum")
        val packagesOfVaranasi = arrayOf("Varanasi Museum", "Varanasi Fort", "Varanasi Cathedral")

        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, destinations)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        destinationSpinner.adapter =spinnerAdapter

        val initialAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, packagesOfParis)
        packageListView.adapter = initialAdapter

        destinationSpinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: android.view.View?, position: Int, id: Long) {
                val selectedPackages = when (position){
                    0 -> packagesOfParis
                    1 -> packagesOfLondon
                    2 -> packagesOfNewYork
                    3 -> packagesOfTokyo
                    4 -> packagesOfSydney
                    5 -> packagesOfVaranasi
                    else -> packagesOfTokyo
                }

                val listAdapter = ArrayAdapter(this@Spinners, android.R.layout.simple_list_item_1, selectedPackages)
                packageListView.adapter = listAdapter
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }

    }
}