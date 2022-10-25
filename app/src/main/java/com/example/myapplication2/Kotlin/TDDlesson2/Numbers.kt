package com.example.myapplication2.Kotlin.TDDlesson2

interface Numbers {
    fun sum(): Int
    fun difference(): Int

    class Base(
        private val number1: Int,
        private val number2: Int
    ): Numbers{
        override fun sum(): Int {
            return number1 + number2
        }

        override fun difference(): Int {
            return number1 - number2
        }
    }
}