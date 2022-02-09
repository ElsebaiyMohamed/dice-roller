package com.s3.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class HomeActivity : AppCompatActivity() {
    private lateinit var image: ImageView
    private lateinit var btnRolle: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        image = findViewById(R.id.img)
        btnRolle = findViewById(R.id.btn_roll)
        btnRolle.setOnClickListener {

            when ((1..6).random()) {
                1 -> image.setImageResource(R.drawable.dice1)
                2 -> image.setImageResource(R.drawable.dice2)
                3 -> image.setImageResource(R.drawable.dice3)
                4 -> image.setImageResource(R.drawable.dice4)
                5 -> image.setImageResource(R.drawable.dice5)
                6 -> image.setImageResource(R.drawable.dice6)
            }
        }
    }
}