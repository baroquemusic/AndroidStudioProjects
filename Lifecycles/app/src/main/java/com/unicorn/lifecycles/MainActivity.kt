package com.unicorn.lifecycles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var button1: Button
    lateinit var button2: Button

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button1 = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)

        button1.setOnClickListener {
            counter++
            textView.text = counter.toString()
        }

        button2.setOnClickListener {

            var intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)

        }

        Log.d("Message", "1st Activity onCreate")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "1st Activity onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "1st Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "1st Activity onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "1st Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "1st Activity onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "1st Activity onRestart")
    }

}