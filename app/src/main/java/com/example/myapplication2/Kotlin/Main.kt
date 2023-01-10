package com.example.myapplication2.Kotlin

object Main {

    private const val a = "a"

    @JvmStatic
    fun main(args: Array<String>){
        val a = A()
        val message = a.sum(10, 10)
        println(message)
    }
}

class A:AI {

    private companion object{
        const val a = "a"
    }

    private var x: Int = 0;
    override fun sum(a: Int, b: Int): Int {
        x = a + b
        return x
    }
}

interface AI{
    fun sum(a: Int, b: Int): Int
}