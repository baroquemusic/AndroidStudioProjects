package com.unicorn.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    lateinit var image : ImageView
    lateinit var result : TextView
    lateinit var toggleButton : ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButton = findViewById(R.id.toggleButton)
        result = findViewById(R.id.result)
        image = findViewById(R.id.image)

        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->

            if (isChecked) {
                image.visibility = View.INVISIBLE
                result.text = "It disappeared!"
            } else {
                image.visibility = View.VISIBLE
                result.text = "Visible again!"
            }

        }

    }
}