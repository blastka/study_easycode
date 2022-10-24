package com.example.myapplication2.Kotlin.lesson1

class Test {
    //const val x = "x" // нельзя написать
    companion object{
        const val x = "x"
        private const val b = "b"
        //private const val c = UniqueList<String>()//нельзя, не примитив
    }
    fun main(){
        Test.b
        Test.x
    }
}