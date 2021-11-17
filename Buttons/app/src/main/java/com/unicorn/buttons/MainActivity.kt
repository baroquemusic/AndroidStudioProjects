package com.unicorn.buttons

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var doMagic : Button
    lateinit var myButton : Button
    lateinit var myText : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doMagic = findViewById(R.id.doMagic)
        myButton = findViewById(R.id.myButton)
        myText = findViewById(R.id.myText)

        doMagic.setOnClickListener {

            doMagic.setBackgroundColor(Color.BLACK)
            myText.setText("My magic is coming up!")
            myText.isVisible = false

        }
        
        myButton.setOnClickListener {

            myText.isVisible = true

        }

    }
}