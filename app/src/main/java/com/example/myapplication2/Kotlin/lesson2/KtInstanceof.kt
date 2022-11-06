package com.example.myapplication2.Kotlin.lesson2

class KtInstanceof {
    fun check(any: Any){
        when(any){
            is String -> println("it is string")
            is Int -> println("it is int")
        }
    }

    fun cast(any: Any){
        any as String
    }
}