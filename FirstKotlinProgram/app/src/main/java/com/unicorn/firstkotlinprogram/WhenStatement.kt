package com.unicorn.firstkotlinprogram

fun main(args: Array<String>) {

    print("Day number of week: ")

    var dayNumber:Int = readLine()!!.toInt()
    var day:String

    when(dayNumber)
    {
        1 -> day = "Mo"
        2 -> day = "Tu"
        3 -> day = "We"
        4 -> day = "Th"
        5 -> day = "Fr"
        6 -> day = "Sa"
        7 -> day = "Su"
        else -> day = "Invalid"
    }

    println(day)

}