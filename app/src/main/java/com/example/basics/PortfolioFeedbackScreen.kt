package com.example.basics

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class PortfolioFeedbackScreen : AppCompatActivity() {

    private lateinit var starImagesForProject: Array<ImageView>
    private lateinit var starImagesForApp: Array<ImageView>
    private lateinit var starImagesForWebsites: Array<ImageView>
    private lateinit var starImagesForUi: Array<ImageView>
    private var selectedRatingForProject = 0
    private var selectedRatingForApp = 0
    private var selectedRatingForWebsites = 0
    private var selectedRatingForUi = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_portfolio_feedback_screen)

        starImagesForProject = arrayOf(
            findViewById(R.id.star_for_project_1),
            findViewById(R.id.star_for_project_2),
            findViewById(R.id.star_for_project_3),
            findViewById(R.id.star_for_project_4),
            findViewById(R.id.star_for_project_5),
            )

        starImagesForApp = arrayOf(
            findViewById(R.id.star_for_apps_1),
            findViewById(R.id.star_for_apps_2),
            findViewById(R.id.star_for_apps_3),
            findViewById(R.id.star_for_apps_4),
            findViewById(R.id.star_for_apps_5),
            )

        starImagesForWebsites = arrayOf(
            findViewById(R.id.star_for_websites_1),
            findViewById(R.id.star_for_websites_2),
            findViewById(R.id.star_for_websites_3),
            findViewById(R.id.star_for_websites_4),
            findViewById(R.id.star_for_websites_5),
            )

        starImagesForUi = arrayOf(
            findViewById(R.id.star_for_ui_1),
            findViewById(R.id.star_for_ui_2),
            findViewById(R.id.star_for_ui_3),
            findViewById(R.id.star_for_ui_4),
            findViewById(R.id.star_for_ui_5),
            )

        val submitButton = findViewById<Button>(R.id.submit_feedback_button)
        submitButton.setOnClickListener {
            val feedbackMessage = """Ratings:
            Projects: $selectedRatingForProject
            Apps: $selectedRatingForApp
            Websites: $selectedRatingForWebsites
            UI/UX: $selectedRatingForUi"""
            val t = Toast.makeText(this, "Feedback Submitted to Team Boy's Apartment", Toast.LENGTH_LONG)
            t.show()
        }

    }

    fun onProjectStarSelected(view: View) {
        val position = starImagesForProject.indexOf(view)
        selectedRatingForProject = position + 1

        starImagesForProject.forEachIndexed { index, imageView ->
            if (index < selectedRatingForProject) {
                imageView.setImageResource(R.drawable.ic_star_filled)
            } else {
                imageView.setImageResource(R.drawable.ic_star_border)
            }
        }
    }

    fun onAppStarSelected(view: View) {
        val position = starImagesForApp.indexOf(view)
        selectedRatingForApp = position + 1

        starImagesForApp.forEachIndexed { index, imageView ->
            if (index < selectedRatingForApp) {
                imageView.setImageResource(R.drawable.ic_star_filled)
            } else {
                imageView.setImageResource(R.drawable.ic_star_border)
            }
        }
    }

    fun onWebsiteStarSelected(view: View) {
        val position = starImagesForWebsites.indexOf(view)
        selectedRatingForWebsites = position + 1

        starImagesForWebsites.forEachIndexed { index, imageView ->
            if (index < selectedRatingForWebsites) {
                imageView.setImageResource(R.drawable.ic_star_filled)
            } else {
                imageView.setImageResource(R.drawable.ic_star_border)
            }
        }
    }

    fun onUiStarSelected(view: View) {
        val position = starImagesForUi.indexOf(view)
        selectedRatingForUi = position + 1

        starImagesForUi.forEachIndexed { index, imageView ->
            if (index < selectedRatingForUi) {
                imageView.setImageResource(R.drawable.ic_star_filled)
            } else {
                imageView.setImageResource(R.drawable.ic_star_border)
            }
        }
    }


}