package com.unicorn.objectorientedprogramming

class MySecondCar {

    var name:String? = null
        private set
                get

    var model:Int? = null

 /*
    constructor(nm:String, md:Int)
    {
        this.name = nm
        this.model = md
    }
*/

    constructor(name: String?, model: Int?) {
        this.name = name
        this.model = model
    }
}