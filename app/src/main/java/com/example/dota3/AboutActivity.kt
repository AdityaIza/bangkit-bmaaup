package com.example.dota3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutActivity:AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val backButton: Button = findViewById(R.id.buttonBack)

        backButton.setOnClickListener{

            val intent = Intent(this@AboutActivity, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
