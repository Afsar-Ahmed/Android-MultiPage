package com.example.week5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var button = findViewById<Button>(R.id.button2)
        button.setOnClickListener(){
            val s = Intent(this@MainActivity, SecondActivity:: class.java)

            startActivity(s)
        }

        var button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener(){
            val third  = Intent(this@MainActivity, thirdActivity:: class.java)
            //intent.putExtra("Name","John")
            startActivity(third)
        }

    }
}
