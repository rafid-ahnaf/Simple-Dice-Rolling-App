package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            Toast.makeText(this, "DICE ROLLED", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val `dice-roll` = dice.roll()
        val result: ImageView = findViewById(R.id.imageView)

        when (`dice-roll`){
            1 -> result.setImageResource(R.drawable.dice_1)
            2 -> result.setImageResource(R.drawable.dice_2)
            3 -> result.setImageResource(R.drawable.dice_3)
            4 -> result.setImageResource(R.drawable.dice_4)
            5 -> result.setImageResource(R.drawable.dice_5)
            6 -> result.setImageResource(R.drawable.dice_6)
        }
    }
}


class Dice(val sides: Int) {

    fun roll(): Int {
        return (1..sides).random()
    }
}