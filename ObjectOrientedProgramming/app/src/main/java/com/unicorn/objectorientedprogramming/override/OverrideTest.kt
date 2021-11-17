package com.unicorn.objectorientedprogramming.override

fun main(args: Array<String>) {

    //creating an object from Vehicle class

    var vehicle = Vehicle()

    vehicle.start()
    vehicle.accelerate(120)
    vehicle.stop()

    //creating an object from Car class

    var car = Car()

    car.superStart()
    car.superAccelerate()
    car.superStop()

    car.start()
    car.accelerate(222)
    car.stop()

}