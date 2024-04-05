package com.example.myapplication2.interview.ikotlin

class LazyFun() {
    private val a: MyClass by lazy { MyClass() }
    private val b: String by lazy { "Abc" }
    private lateinit var d: String

    fun ab() {
        if (::d.isInitialized) {
            val first = d
        }
        val x = null
        val l = listOf(null)
    }
}

class MyClass {
    val lazyValue: String by lazy {
        println("Вычисление значения")
        "Hello"
    }

    init {
        println("Инициализация MyClass")
    }
}

fun main() {
    LazyFun().ab()
    val myObject = MyClass()
    println("Обращение к lazyValue")
    println(myObject.lazyValue)
    println("Обращение к lazyValue еще раз")
    println(myObject.lazyValue)
}