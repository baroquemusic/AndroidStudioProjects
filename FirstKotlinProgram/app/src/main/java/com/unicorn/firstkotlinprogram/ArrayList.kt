package com.unicorn.firstkotlinprogram

fun main(args: Array<String>) {

    var age = ArrayList<Int>()

    age.add(10)
    age.add(1, 15)
    age.add(20)

    println("Boo " + age[0] + " " + age[1] + " Hurray! ${age[2]} is in age[2]")

    age.remove(15)

    println("Wow " + age[0] + " " + age[1])

    age.add(40)

    println("Boo " + age[0] + " " + age[1] + " Hurray! ${age[2]} is in age[2]")

    var myMixedArrayList = ArrayList<Any>()

    myMixedArrayList.add("String")
    myMixedArrayList.add(3.5)
    myMixedArrayList.add(true)



}