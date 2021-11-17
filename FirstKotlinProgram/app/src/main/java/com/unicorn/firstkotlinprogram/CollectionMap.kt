package com.unicorn.firstkotlinprogram

fun main(args: Array<String>) {

    // immutable
    var age = mapOf<String,Int>("david" to 20, "joe" to 30)

    println("Age of Joe is " + age["joe"])

    // mutable
    var mutableAge = mutableMapOf<String,Int>("david" to 20, "joe" to 30)

    mutableAge.put("bill", 40)

    println(mutableAge["bill"])
    println(mutableAge.size)

}