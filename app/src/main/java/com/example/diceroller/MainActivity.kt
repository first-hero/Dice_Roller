package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diceroller.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rollButton.setOnClickListener {
            rollDice()
        }


    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        when (randomInt){
            1 -> binding.diceImage.setImageResource(R.drawable.dice_1)
            2 -> binding.diceImage.setImageResource(R.drawable.dice_2)
            3 -> binding.diceImage.setImageResource(R.drawable.dice_3)
            4 -> binding.diceImage.setImageResource(R.drawable.dice_4)
            5 -> binding.diceImage.setImageResource(R.drawable.dice_5)
            else -> binding.diceImage.setImageResource(R.drawable.dice_6)
        }
    }

}