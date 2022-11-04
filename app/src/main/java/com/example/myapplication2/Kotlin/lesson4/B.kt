package com.example.myapplication2.Kotlin.lesson4

import java.io.InputStream
import java.lang.Exception

class B {
    object J {
        @JvmStatic
        fun main(args: Array<String>) {
            //find let
            val list2 = listOf<String>()
            var list: List<String> = arrayListOf()
            println(list2)
            println(list)
            list.find {
                it.isNotEmpty()
            }?.let {
                println(it)
            }
            //apply also
            list2.apply {
                get(1)
            }
            list.also {
                it.get(1)
            }

            val x: InputStream = InputStream
            try {
                //это лямбда внутри скобок
                x.use { inputStream ->

                }
            }catch (e: Exception){

            }


        }
    }
}