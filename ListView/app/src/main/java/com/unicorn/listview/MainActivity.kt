package com.unicorn.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listView: ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.myListView)

        var cityList = resources.getStringArray(R.array.cities)

        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, cityList)

        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { parent, view, position, id ->

            val cityName : String = parent.getItemAtPosition(position).toString()

            Toast.makeText(applicationContext, "Your City is $cityName", Toast.LENGTH_SHORT).show()

        }

    }
}