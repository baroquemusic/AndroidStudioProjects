package com.unicorn.objectorientedprogramming.abstract

fun main(args: Array<String>) {

    //var vehicle = Vehicle()

    var car = Car(2011)
    car.speed = 333

    println("Name: ${car.vehicleName("Lamborghini")} \n" +
            "Type: ${car.vehicleType("Car")} \n" +
            "Model: ${car.model} \n" +
            "Speed: ${car.speed}.")

}