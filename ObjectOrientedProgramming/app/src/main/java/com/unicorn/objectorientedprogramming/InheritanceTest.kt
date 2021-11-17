package com.unicorn.objectorientedprogramming

fun main(args: Array<String>) {

    //creating an object from Car class

    var car = Car()

    car.type = "Car"
    car.model = "Ferrari"
    car.maxSpeed = 350

    car.show()

    //creating an object from Motorcycle class

    var motorcycle = Motorcycle()
    motorcycle.type = "Motorcycle"
    motorcycle.model = "Yamaha"
    motorcycle.maxSpeed = 230

    motorcycle.show()

}