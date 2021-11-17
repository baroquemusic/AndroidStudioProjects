package com.unicorn.checkboxes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var male : CheckBox
    lateinit var female : CheckBox
    lateinit var result : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        male = findViewById(R.id.checkBoxMale)
        female = findViewById(R.id.checkBoxFemale)
        result = findViewById(R.id.textViewResult)

        male.setOnClickListener {

            if (male.isChecked) {
                result.text = "You're a dude!"
                female.isChecked = false
            } else {
                result.text = "What is it, hmmm?"
            }

        }

        female.setOnClickListener {

            if (female.isChecked) {
                result.text = "You're a gal!"
                male.isChecked = false
            } else {
                result.text = "What is it, you're unsure?"
            }

        }

    }
}