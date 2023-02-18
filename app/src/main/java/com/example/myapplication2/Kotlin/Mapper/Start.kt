package com.example.myapplication2.Kotlin.Mapper

/**
 * Если так написать то это сильная связность,
 * Если удалить класс Two все сломается
 */
class One1(private val a: String){
    fun show(b : Two1){
        b.showString(a)
    }
}

class Two1(private val x: Int){
    fun showString(a: String){
        for (i in 0..x)
            println(x)
    }
}

fun main() {

}