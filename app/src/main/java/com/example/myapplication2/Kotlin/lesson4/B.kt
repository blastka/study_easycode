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
            //apply
            list2.apply {
                get(1)
            }
            //also
            list.also {
                it.get(1)
                val b = AB.Base()
            }

            /*val x: InputStream
            try {
                //это лямбда внутри скобок
                x.use { inputStream ->

                }
            }catch (e: Exception){

            }*/
            //with
            val ab = AB.Base()
            ab.one()
            ab.two()

            with(AB.Base()){
                one()
                two()
            }

            //let
            AB.Base().let {
                it.one()
                it.two()
                Abc().doSome(it)
            }
            //also
            AB.Base().also {
                it.one()
                it.two()
                Abc().doSome(it)
            }

            AB.Base().apply {
                one()
                two()
            }

        }
        //разница let also, let не может отдать объект
        /*fun getTest(): AB{
            return AB.Base().let {
                it.one()
                it.two()
            }
        }*/

        fun getTest2(): AB{
            return AB.Base().also {
                it.one()
                it.two()
            }
        }

    }
}