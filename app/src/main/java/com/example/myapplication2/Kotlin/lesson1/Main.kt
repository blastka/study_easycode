package com.example.myapplication2.Kotlin.lesson1

import android.util.Log
import com.example.myapplication2.Kotlin.A

object Main {
    @JvmStatic
    fun main(args: Array<String>){
        x()
        //Test.b // нельзя получить доступ, хорошая константа
        Test.x //просто доступ без создания обьекта, как статика, доступ к переменной через класс
        val test = Test()
        //test.x // нельзя получить доступ, неизвестная ссылка, так как константа это не свойство
        //test.b // наверное можно сказать, что мы создали объект, а в объекте нет констант
        Test.H.h //вложенный объект с константой
        R.r // отдельный объект с константой
    }

    fun x(){
        val a: UniqueList<String> = UniqueList()//пример чтобы не использовать эстеншн функции
        a.add("5")
        println(a)
        val b: MutableList<String> = mutableListOf()
            b.addItem("1")//от себя добавляемые методы другого цвета
        println(b)
    }
}

fun <T> MutableList<T>.addItem(item:T){ //public static <T> void addItem(List<T>, T item)
    if (!contains(item))
        add(item)
}