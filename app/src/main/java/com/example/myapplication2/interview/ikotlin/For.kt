package com.example.myapplication2.interview.ikotlin

fun <T> List<T>.myFor(action: (T) -> Unit) {
    for (element in this) {
        action(element)
        println(action)
    }
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.myFor {
        println(it)
    }
}


