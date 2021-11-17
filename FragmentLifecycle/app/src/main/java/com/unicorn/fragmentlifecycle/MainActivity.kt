package com.unicorn.fragmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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