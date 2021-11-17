package com.unicorn.edittexts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var button : Button
    lateinit var result : TextView
    lateinit var image : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.editTextName)
        button = findViewById(R.id.buttonOk)
        result = findViewById(R.id.result)
        image = findViewById(R.id.imageView)

        button.setOnClickListener {

            image.setImageResource(R.drawable.img_1)

            var userName : String = name.text.toString()
            result.setText(userName)
            //result.text = userName

        }

    }
}