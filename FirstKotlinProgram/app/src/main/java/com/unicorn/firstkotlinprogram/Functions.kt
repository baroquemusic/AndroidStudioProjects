package com.unicorn.firstkotlinprogram

fun main(args: Array<String>) {

    print("Nums? ")
    var n1:Int = readLine()!!.toInt()
    var n2:Int = readLine()!!.toInt()

    show(n1, n2)
    println("Sum: " + add(n1, n2))
    println("Lowest: " + findMinNum(n1, n2))

}

fun show(n1:Int, n2:Int) {
    println("Numbers: $n1 and $n2!")
}

fun add(n1:Int, n2:Int) : Int {
    var sum:Int = 0
    sum = n1 + n2
    return sum
}

fun findMinNum(n1:Int, n2:Int) : Int {
    var min:Int
    if (n1 > n2) {
        min = n2
    } else {
        min = n1
    }
    return  min
}