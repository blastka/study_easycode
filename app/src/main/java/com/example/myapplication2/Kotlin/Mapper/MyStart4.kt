package com.example.myapplication2.Kotlin.Mapper

/** Класс повтор 3го
 * Теперь попытаемся сделать 3й класс
 * Чтоб сделать разношерстный вызов методов от разных классов, сделали
 * дженерики
 */

/**
 * ShowString4<Unit> - вот это выглядит как-то не красиво
 */
class OneS4(private val a: String){
    fun <T>show(b : ShowString4<T>){//дженерик потому что у двух классов этот метод делает разные вещи
        b.showString(a) //метод у закиданых объектов
    }
}

class TwoS4(private val x: Int): ShowString4<Unit>{//ничего не возвращает
override fun showString(a: String){//забирает данные у OneS3
    println(a + "5" + x.toString())
}
}

class ThreeS4(private val x: Int): ShowString4<Int>{//возвращает Int
override fun showString(a: String): Int{//забирает данные у OneS3
    println(a.toInt() * x)
    return a.toInt() * x
}
}

interface ShowString4<T>{
    fun showString(a: String): T
}

fun main() {
    val one = OneS4("123")
    val two = TwoS4(1)
    val three = ThreeS4(2)
    one.show(two)
    one.show(three)
}