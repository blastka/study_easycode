package com.example.myapplication2.Kotlin.lesson1

class Test {
    //const val x = "x" // нельзя написать, нужно обернуть в объект
    companion object{
        const val x = "x"//плохая константа ,похожа на статик
        private const val b = "b"
        //private const val c = UniqueList<String>()//нельзя, не примитив
    }

    object H{
        const val h = "r"
    }

    fun main(){
        b
        x
        R.r
    }
}

object R{
     const val r = "r"
}

