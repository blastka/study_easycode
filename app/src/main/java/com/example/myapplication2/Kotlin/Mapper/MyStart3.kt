package com.example.myapplication2.Kotlin.Mapper

/**
 * Теперь попытаемся сделать 3й класс
 * Чтоб сделать разношерстный вызов методов от разных классов, сделали
 * дженерики
 */

/**
 * Мы закинули в метод Интерфейс, чтобы отдать приватное свойство прокиданому объекту
 * вызвав у этого объекта свой метод
 */
class OneS3(private val a: String){
    fun <T>show(b : ShowString3<T>){//дженерик потому что у двух классов этот метод делает разные вещи
        b.showString(a) //метод у закиданых объектов
    }
}

class TwoS3(private val x: Int): ShowString3<Unit>{//ничего не возвращает
    override fun showString(a: String){//забирает данные у OneS3
            println(a + "5" + x.toString())
    }
}

class ThreeS3(private val x: Int): ShowString3<Int>{//возвращает Int
    override fun showString(a: String): Int{//забирает данные у OneS3
        println(a.toInt() * x)
        return a.toInt() * x
    }
}

interface ShowString3<T>{
    fun showString(a: String): T
}

fun main() {
    val one = OneS3("123")
    val two = TwoS3(1)
    val three = ThreeS3(2)
    one.show(two)
    one.show(three)
}