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

    companion object{
        private const val a = "a"
    }

    private var x: Int = 0;
    override fun sum(a: Int, b: Int) {
        x = a + b
    }
}

interface AI{
    fun sum(a: Int, b: Int)
}