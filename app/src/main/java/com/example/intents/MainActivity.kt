package com.example.intents

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val expBtn = findViewById<Button>(R.id.expBtn)
        expBtn.setOnClickListener {
            val Intent = Intent(this, NewScreen::class.java)
            startActivity(Intent)
        }
        val impBtn: Button= findViewById(R.id.impBtn)
        impBtn.setOnClickListener{
            val openURL=Intent(android.content.Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://zalegoacademy.ac.ke/")

            startActivity(openURL)
        }
    }
}