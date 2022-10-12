package com.example.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.BoringLayout
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val text1 = findViewById<EditText>(R.id.num1)
      val text2 = findViewById<EditText>(R.id.num2)



        val intent = Intent(this, secondscreen::class.java)

        findViewById<Button>(R.id.addition).setOnClickListener {
            if(text1.text.isNullOrEmpty() || text2.text.isNullOrEmpty()) {

                Toast.makeText(this, "Please, fill in both fields", Toast.LENGTH_SHORT).show()
            }else {
                val value1 = text1.text.toString()
                val value2 = text2.text.toString()
                var result = (Integer.parseInt(value1) + Integer.parseInt(value2)).toString()


                intent.putExtra("result", result)
                startActivity(intent)
            }

        }
        findViewById<Button>(R.id.subtraction).setOnClickListener {
            if(text1.text.isNullOrEmpty() || text2.text.isNullOrEmpty()) {

                Toast.makeText(this, "Please, fill in both fields", Toast.LENGTH_SHORT).show()
            }else {
                val value1 = text1.text.toString()
                val value2 = text2.text.toString()
               var result = ( Integer.parseInt(value1) - Integer.parseInt(value2) ).toString()
                intent.putExtra("result", result)
                startActivity(intent)
            }
        }

        findViewById<Button>(R.id.multiplication).setOnClickListener {
            if(text1.text.isNullOrEmpty() || text2.text.isNullOrEmpty()) {

                Toast.makeText(this, "Please, fill in both fields", Toast.LENGTH_SHORT).show()
            }else {
                val value1 = text1.text.toString()
                val value2 = text2.text.toString()
               var result = (Integer.parseInt(value1) * Integer.parseInt(value2)).toString()
                intent.putExtra("result", result)
                startActivity(intent)
            }
        }
        findViewById<Button>(R.id.division).setOnClickListener {
            if(text1.text.isNullOrEmpty() || text2.text.isNullOrEmpty()) {

                Toast.makeText(this, "Please, fill in both fields", Toast.LENGTH_SHORT).show()
            }else{
                val value1 = text1.text.toString()
                val value2 = text2.text.toString()
               var result = (Integer.parseInt(value1) / Integer.parseInt(value2)).toString()
            intent.putExtra("result", result)
            startActivity(intent)

            }
        }


    }

}






