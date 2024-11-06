package com.dicoding.exam.exam3

// TODO
fun checkType(args: Any): String {
    val dataType = when (args) {
        is Int -> "Integer"
        is String -> "String"
        is Boolean -> "Boolean"
        is Double -> "Double"
        is List<*> -> "List"
        is Map<*, *> -> "Map"
        else -> "Unknown"
    }
    return "Yes! it's $dataType"
}

fun main() {
    // Contoh penggunaan
    println(checkType(10))
    println(checkType("Hello"))
    println(checkType(true))
    println(checkType(3.14))
    println(checkType(listOf("A", "B")))
    println(checkType(mapOf(1 to "A")))
}


