package com.example.myapplication2.Kotlin.Mapper

/**
 * Чтобы не сломалась, сделаем интерфейс
 * Теперь ничего не ломается, можно сделать 3й класс, но если попытаться не выйдет
 * делаем для этого
 * дженерикотипизированный интерфейс
 */

class One2(private val a: String){
    fun <T>show(b : ShowString<T>){
        b.showString(a)
    }
}

class Two2(private val x: Int): ShowString<Unit>{
    override fun showString(a: String){
        for (i in 0..x)
            println(x)
    }
}

class Three2(private val x: Int): ShowString<Int>{
    override fun showString(a: String): Int {
        for (i in 0..x)
            println(x)
        return 0
    }
}

interface ShowString<T>{
    fun showString(a: String): T
}

fun main() {
    val one2 = One2("abcd")
    one2.show(Three2(1))
    one2.show(Two2(1))
}