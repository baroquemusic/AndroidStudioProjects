package com.unicorn.firstkotlinprogram

fun main(args: Array<String>) {

    print("Number: ")

    var n:Int = readLine()!!.toInt()

    if (n % 2 == 0) {
        println("$n is Even")
    } else {
        println("$n is Odd")
    }

    print("Age? ")

    var age:Int = readLine()!!.toInt()

    if (age < 10) {
        println("Preteen")
    } else if (age < 20) {
        println("Teen")
    } else {
        if (age < 65) {
            println("Adult")
        } else {
            println("Senior")
        }
    }

}