package com.unicorn.firstkotlinprogram

import kotlin.random.Random

fun main(args: Array<String>) {

    var i = 5
    while (i > 0)
    {
        println(i--)
    }

// infinite loop

    val num = Random.nextInt(0, 100)

    println("Number? ")

    while (2 > 1)
    {
        val guess:Int = readLine()!!.toInt()
        if (guess == num) {
            println("Congrats!")
            break
        } else if (guess < num) {
            println("Bigger!")
        } else {
            println("Smaller!")
        }
    }

}