package com.unicorn.firstkotlinprogram

fun main(args: Array<String>) {

    var numArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)

    for (y in numArray.indices)
    {
        println("numArray[$y] is ${numArray[y]}")
    }

    numArray.forEach { print(it) }

}