package com.example.myapplication2.Kotlin.lesson2Kt

//синглтон, это похоже на статику
internal object Main {
    @JvmStatic
    fun main(array: Array<String>){
        Singleton.increment()
        Singleton.increment()
        Singleton.print()
    }
}

internal object Singleton{
    private var x = 0

    fun increment(){
        x++
    }

    fun print(){
        print(x)
    }
}