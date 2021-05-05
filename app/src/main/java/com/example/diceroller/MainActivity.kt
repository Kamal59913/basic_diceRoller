package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button =findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()//alt+enter to create a new function
        }

    }

    private fun rollDice() {
        var randomInt= java.util.Random().nextInt(7)//In kotlin variable names should be written in camelCase
        val drawableResource=when (randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else-> R.drawable.dice_6
        }
        val diceImage: ImageView=findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)
    }
}


