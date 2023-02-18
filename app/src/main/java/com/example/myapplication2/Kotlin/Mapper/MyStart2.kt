package com.example.myapplication2.Kotlin.Mapper

/**
 * напишем интерфейс для разрыва сильной связи
 */
class OneS2(private val a: String){
    fun show(b : ShowString2){
        b.showString(a)
    }
}

class TwoS2(private val x: Int): ShowString2{
    override fun showString(a: String){
        for (i in 0..x)
            println(x)
    }
}

interface ShowString2{
    fun showString(a: String)
}

fun main() {

}