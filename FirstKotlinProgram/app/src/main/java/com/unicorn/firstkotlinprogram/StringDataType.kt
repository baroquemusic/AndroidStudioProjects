package com.unicorn.firstkotlinprogram

fun main(args: Array<String>) {
    var a:String = "Hello Kotlin"
    var b:String = "Language"
    var age:Int = 25

    var l:Int = a.length

    println("Length of a: " + l)

    var c:Boolean = b.equals("Language")

    println(c)

    println(b.isEmpty())

    println(b.plus(" Mastery"))

    println(a.uppercase())
    println(a.lowercase())

    var t:String = "     Hurray    Hurray     "

    println(a + t + b)
    println(a + t.trim() + b)



}