package com.unicorn.objectorientedprogramming.override

open class Vehicle {

    open fun start()
    {
        println("Vehicle started!")
    }

    open fun accelerate(speed:Int)
    {
        println("Vehicle accelerates at $speed.")
    }

    open fun stop()
    {
        println("Vehicle stopped!")
    }
}