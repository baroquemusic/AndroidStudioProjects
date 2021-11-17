package com.unicorn.firstkotlinprogram

fun main(args: Array<String>) {

    print("Name? ")

    var name:String? = readLine()

    print("Age? ")

    var age:Int = readLine()!!.toInt()

    println("Name: $name, Age: $age")


}