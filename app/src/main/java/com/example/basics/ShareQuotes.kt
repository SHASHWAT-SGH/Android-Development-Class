package com.example.basics

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ShareQuotes : AppCompatActivity() {

    private var selectedQuote: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_share_quotes)

        val btnShare = findViewById<Button>(R.id.btn_share_quote)

        val radioButton1 = findViewById<RadioButton>(R.id.radio_quote_1)
        val radioButton2 = findViewById<RadioButton>(R.id.radio_quote_2)
        val radioButton3 = findViewById<RadioButton>(R.id.radio_quote_3)
        val radioButton4 = findViewById<RadioButton>(R.id.radio_quote_4)
        val radioButton5 = findViewById<RadioButton>(R.id.radio_quote_5)
        val radioButton6 = findViewById<RadioButton>(R.id.radio_quote_6)
        val radioButton7 = findViewById<RadioButton>(R.id.radio_quote_7)
        val radioButton8 = findViewById<RadioButton>(R.id.radio_quote_8)

        val radioButtons = arrayOf(radioButton1, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioButton7, radioButton8)

        radioButtons.forEach { radioButton ->
            radioButton.setOnClickListener {
                onRadioButtonClicked(radioButton, radioButtons)
            }
        }

        btnShare.setOnClickListener {
            selectedQuote?.let { quote ->
                shareQuote(quote)
            } ?: Log.d("ShareQuotes", "No quote selected")
        }
    }


    private fun onRadioButtonClicked(selected: RadioButton, radioButtons: Array<RadioButton>) {

        radioButtons.forEach { radioButton ->
            if (radioButton != selected) {
                radioButton.isChecked = false
            }
        }

        selectedQuote = selected.text.toString()
    }


    private fun shareQuote(quote: String) {
        val sendIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, quote)
            type = "text/plain"
        }
        startActivity(Intent.createChooser(sendIntent, "Share Quote via"))
    }
}
