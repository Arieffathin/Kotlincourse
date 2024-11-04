package com.dicoding.exam.exam2

// TODO 1
fun calculate(valueA: Int, valueB: Int, valueC: Int? = null): Int {
    val finalValueC = valueC ?: 50
    return valueA + valueB - finalValueC
}

// TODO 2
fun result(value: Int): String {
    return "Result is $value"
}
fun main(){
    val value = 54
    val valueA = 101
    val valueB = 52
    val valueC : Int? = 99
    println(result(value))
}