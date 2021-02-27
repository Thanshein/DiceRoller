package com.elnino.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {


    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRool = findViewById<Button>(R.id.roll_buttton)
        btnRool.setOnClickListener{
            diceRoll()
        }
        diceImage = findViewById<ImageView>(R.id.dice_image)

    }

    private fun diceRoll() {
        //Random Range
        val randomInt = (1..6).random()
        val drawableResources= when(randomInt){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResources)
    }
}