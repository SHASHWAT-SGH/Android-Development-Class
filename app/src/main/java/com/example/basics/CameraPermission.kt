package com.example.basics

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CameraPermission : AppCompatActivity() {
    val c = 1
    private val REQUEST_IMAGE_CAPTURE = 1
    private lateinit var btnCamera: CardView
    private lateinit var imgView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_camera_permission)
        btnCamera = findViewById<androidx.cardview.widget.CardView>(R.id.btn_camera)
        imgView = findViewById(R.id.camera_image)

        btnCamera.setOnClickListener {
            if(ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED){
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA), c)
            }else{
                val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivity(intent)
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == c){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Camera permission denied", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK){
            val imageBitmap = data?.extras?.get("data") as android.graphics.Bitmap
            imgView.setImageBitmap(imageBitmap)
        }
    }


}