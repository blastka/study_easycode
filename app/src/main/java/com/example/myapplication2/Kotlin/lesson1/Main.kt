package com.example.myapplication2.Kotlin.lesson1

import android.util.Log
import com.example.myapplication2.Kotlin.A

object Main {
    @JvmStatic
    fun main(args: Array<String>){
        x()
        //Test.b // нельзя получить доступ
        Test.x //считай просто доступ без создания обьекта
        val test = Test()
        //test.x // нельзя получить доступ
        //test.b // нельзя получить доступ
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