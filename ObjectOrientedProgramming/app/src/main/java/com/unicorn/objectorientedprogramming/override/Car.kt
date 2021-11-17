package com.unicorn.objectorientedprogramming.override

class Car : Vehicle() {

    fun superStart()
    {
        super.start()
    }

    fun superAccelerate()
    {
        super.accelerate(88)
    }

    fun superStop()
    {
        super.stop()
    }




    override fun start()
    {
        println("Car started!")
    }

    override fun accelerate(speed:Int)
    {
        println("Car accelerates at $speed.")
    }

    override fun stop()
    {
        println("Car stopped!")
    }

}