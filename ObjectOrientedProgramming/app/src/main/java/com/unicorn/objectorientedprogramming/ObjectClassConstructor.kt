package com.unicorn.objectorientedprogramming

fun main(args: Array<String>) {

// creating an object from class
/*
    var myCar = Cars()
    myCar.name = "Ferrari"
    myCar.model = 2021

    println("Name: ${myCar.name}, Model: ${myCar.model}.")
 */

    // var myNewCar = MyCars("Ferrari", 2021)

    // println("Name: ${myNewCar.name}, Model: ${myNewCar.model}.")

    var mySecondCar = MySecondCar("Mercedes", 1990)

    // mySecondCar.name = "Austin"
    mySecondCar.model = 2222

    println("Name: ${mySecondCar.name}, Model: ${mySecondCar.model}.")



}