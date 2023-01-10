package com.example.myapplication2.Kotlin



object Stack {
    @JvmStatic
    fun main(args: Array<String>) {
        var stack = ArrayDeque<Int>()
        stack.add(1)
        stack.add(2)
        stack.add(3)
        println(stack)
    }
}