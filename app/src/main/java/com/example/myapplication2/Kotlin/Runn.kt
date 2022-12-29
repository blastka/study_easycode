package com.example.myapplication2.Kotlin

object Runn {
    @JvmStatic
    fun main(args: Array<String>) {
        val ab = Ab.Base()
        val c = ab.run {
            do1()
            do3()
            do2()
        }
        println(c)
    }

    fun test(){
        val ab = Ab.Base()
        ab.run {
            do1()
            do3()
            do2()
        }
    }
}

interface Ab{
    fun do1()
    fun do2(): String
    fun do3()

    class Base(): Ab{
        override fun do1() {
            println("1")
        }

        override fun do2(): String {
            return "2"
        }

        override fun do3() {
            println("3")
        }

    }
}