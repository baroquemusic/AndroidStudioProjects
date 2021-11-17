package com.unicorn.mathgame

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var add: Button
    lateinit var sub: Button
    lateinit var multi: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add = findViewById(R.id.buttonAdd)
        sub = findViewById(R.id.buttonSub)
        multi = findViewById(R.id.buttonMulti)

        add.setOnClickListener {

            val intent = Intent(this@MainActivity, GameActivity::class.java)
            startActivity(intent)

        }

    }
}