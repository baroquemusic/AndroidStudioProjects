package com.unicorn.lifecycles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        button = findViewById(R.id.button3)

        button.setOnClickListener {

            var intent = Intent(this@SecondActivity, MainActivity::class.java)
            startActivity(intent)

        }

        Log.d("Message", "2nd Activity onCreate")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "2nd Activity onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "2nd Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "2nd Activity onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "2nd Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "2nd Activity onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "2nd Activity onRestart")
    }

}