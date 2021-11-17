package com.unicorn.objectorientedprogramming.interfaces

class Vehicles : CanGo, CanStop {
    override val name: String
        get() = "Trabant"

    override fun stop() {
        println("Vehicles can STOP!")
    }
}