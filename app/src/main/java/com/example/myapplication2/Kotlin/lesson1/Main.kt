package com.example.myapplication2.Kotlin.lesson1

class Main {
    fun x(){
        val a: MutableList<String> = mutableListOf("a", "b")
        a.add("5")
        a.addItem("1")//от себя добавляемые методы другого цвета
    }
}

fun <T> MutableList<T>.addItem(item:T){ //public static <T> void addItem(List<T>, T item)
    if (!contains(item))
        add(item)
}