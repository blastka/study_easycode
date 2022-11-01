package com.example.myapplication2.Kotlin.TDDlesson2

interface Numbers {
    fun sum(): Int
    fun difference(): Int
    fun divide(): Double
    fun isSumLong(): Boolean
    fun sumLong(): Long
    fun sumInt(): Int

    class Base(
        private val number1: Int,
        private val number2: Int
    ) : Numbers {

        private var wasSumLongCalled = false
        private var wasSumLong = false

        override fun sum(): Int {
            return number1 + number2
        }

        override fun difference(): Int {
            return number1 - number2
        }

        override fun divide(): Double {
            if (number2 == 0) {
                throw IllegalArgumentException("На ноль делить нельзя!")
            }
            return number1.toDouble() / number2
        }

        override fun isSumLong(): Boolean {
            wasSumLongCalled = true
            val rest = Int.MAX_VALUE - number1
            val result = number2 > rest
            wasSumLong = result
            return result
        }

        override fun sumLong(): Long {
            if (wasSumLongCalled) {
                if (wasSumLong) {
                    return number1.toLong() + number2
                }
                throw IllegalStateException("Тебе не следует использовать этот метод: sumInt")
            }
            throw IllegalStateException("Тебе следует сначала проверить сумму методом isSumLong")
        }

        override fun sumInt(): Int {
            if (wasSumLongCalled) {
                if (wasSumLong) {
                    throw IllegalStateException("Тебе не следует использовать этот метод: sumInt")
                }
                return number1 + number2
            }
            throw IllegalStateException("Тебе следует сначала проверить сумму методом isSumLong")
        }
    }
}