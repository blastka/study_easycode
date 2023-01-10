package com.example.myapplication2.Kotlin.Mapper

/**
 * Переименовали на ,map и Mapper чтоб понятней было
 */

class One3(private val a: String){
    fun <T>show(mapper : Mapper<T>): T{
        return mapper.map(a)
    }
}

class Two3(private val x: Int): Mapper<Int>{
    override fun map(a: String): Int {
        for (i in 0..x)
            println(x)
        return x
    }
}

class Three3(private val x: Int): Mapper<Double>{
    override fun map(a: String): Double {
        return 0.9
    }
}

interface Mapper<T>{
    fun map(a: String): T
}

fun main() {
    val one3 = One3("abcd")
    val x: Int = one3.show(Two3(1))
    one3.show(Three3(1))

}