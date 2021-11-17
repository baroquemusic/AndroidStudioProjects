package com.unicorn.firstkotlinprogram

fun main(args: Array<String>) {

    var myCharRange = 'a'.rangeTo('g')
    var myCharRange2 = 'a'..'g'

    println('c' in myCharRange)
    println('z' in myCharRange2)

}