package com.example.treinandoandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        /*Trocar o nome da variável
         val resultText: TextView = findViewById(R.id.result_text)
         resultText.text = "HI"
        */

        //Exibindo número aleatório
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()


        //chamar apresentação de mensagem de click
        rollButton.setOnClickListener { rollDice() }

    }



    //função para apresentar mensagem de click
    private fun rollDice() {
        Toast.makeText(this, "Well Come ", Toast.LENGTH_SHORT).show()


    }
}