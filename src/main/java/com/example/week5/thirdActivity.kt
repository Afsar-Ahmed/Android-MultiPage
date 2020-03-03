package com.example.week5

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_third.*

class thirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        //val txtView = findViewById<TextView>(R.id.textView)

        //Safe Type Casting which is assuming if the value is null or not type data type with ?
        var bundle:Bundle ?=intent.extras
        var msg = bundle!!.getString("Name")
        var strUser:String = intent.getStringExtra("Name")

        //txtView.text = "Hi" + strUser


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){

            R.id.menuitem1 -> {
                Toast.makeText(this,"Menu 1 is selected",Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.menuitem2 -> {
                Toast.makeText(this,"Menu 2 is selected",Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.menuitem3 -> {
                Toast.makeText(this,"Menu 3 is selected",Toast.LENGTH_SHORT).show()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }


    }
}
