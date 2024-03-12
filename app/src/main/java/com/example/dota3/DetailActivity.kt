package com.example.dota3

import android.app.Person
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.dota3.Hero
import com.example.dota3.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setTitle("About")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val dataHero = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra<Hero>("DATA", Hero::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra<Hero>("DATA")
        }
        val tvDetailName = findViewById<TextView>(R.id.titleTextView)
        val tvDetailDescription = findViewById<TextView>(R.id.descriptionTextView)
        val ivDetailPhoto = findViewById<ImageView>(R.id.detailImageView)

        tvDetailName.text = dataHero?.name
        tvDetailDescription.text = dataHero?.description
        ivDetailPhoto.setImageResource(dataHero?.photo!!)
    }
}
