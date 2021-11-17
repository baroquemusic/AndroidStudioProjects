package com.unicorn.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    var countryNameList = ArrayList<String>()
    var detailList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    lateinit var adapter: CountriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        countryNameList.add("Bulgaria")
        countryNameList.add("Switzerland")
        countryNameList.add("Czech Republic")
        countryNameList.add("Great Britain")
        countryNameList.add("Greece")
        countryNameList.add("Hungary")
        countryNameList.add("United States")

        detailList.add("Bulgaria is a cute country")
        detailList.add("Switzerland is very clean")
        detailList.add("Czech Republic is cool")
        detailList.add("England is cold and wet")
        detailList.add("Greece has ancient history")
        detailList.add("Hungary is weird")
        detailList.add("USA is heaven and hell, no freedom")

        imageList.add(R.drawable.bg)
        imageList.add(R.drawable.ch)
        imageList.add(R.drawable.cz)
        imageList.add(R.drawable.gb)
        imageList.add(R.drawable.gr)
        imageList.add(R.drawable.hu)
        imageList.add(R.drawable.us)

        adapter = CountriesAdapter(countryNameList, detailList, imageList, this@MainActivity)

        recyclerView.adapter = adapter

    }
}