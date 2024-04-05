package com.example.myapplication2.Kotlin

fun main() {
    val a1 = A1.Base(6)
    val b1 = B1()
    a1.a(b1)
}

interface Show{
    fun show(x: Int)
}

class B1: Show{
    override fun show(x: Int){
        println(x)
    }
}

interface A1{
    fun a(b: Show)

    class Base(private val x: Int): A1{
        override fun a(b: Show) {
            b.show(x)
        }
    }
}
