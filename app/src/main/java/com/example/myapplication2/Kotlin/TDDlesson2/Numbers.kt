package com.example.myapplication2.Kotlin.TDDlesson2

interface Numbers {
    fun sum(): Int
    fun difference(): Int
    fun divide(): Double

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

        override fun divide(): Double {
            /*
            если второй аргумент равен нулю то сказать, что на ноль делить нельзя
             */
            if (number2 == 0){
                throw IllegalArgumentException("На ноль делить нельзя!")
            }
            return number1.toDouble() / number2
        }
    }
}