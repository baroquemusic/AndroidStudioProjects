package com.unicorn.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var gridView: GridView

    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)

        fillArrays()

        val adapter = CountriesAdapter(this, nameList, imageList)

        gridView.adapter = adapter

        gridView.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(applicationContext, "You picked ${nameList[position]}", Toast.LENGTH_SHORT).show()

        }

    }

    fun fillArrays() {

        nameList.add("Austria")
        nameList.add("Bulgaria")
        nameList.add("Canada")
        nameList.add("Switzerland")
        nameList.add("Czech Republic")
        nameList.add("Greece")
        nameList.add("Hungary")
        nameList.add("Japan")
        nameList.add("Sweden")
        nameList.add("Turkey")
        nameList.add("United States")

        imageList.add(R.drawable.at)
        imageList.add(R.drawable.bg)
        imageList.add(R.drawable.ca)
        imageList.add(R.drawable.ch)
        imageList.add(R.drawable.cz)
        imageList.add(R.drawable.gr)
        imageList.add(R.drawable.hu)
        imageList.add(R.drawable.jp)
        imageList.add(R.drawable.se)
        imageList.add(R.drawable.tr)
        imageList.add(R.drawable.us)

    }

}