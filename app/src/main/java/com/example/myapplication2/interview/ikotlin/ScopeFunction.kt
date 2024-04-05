package com.example.myapplication2.interview.ikotlin

import com.example.myapplication2.Kotlin.lesson4.AB
import com.example.myapplication2.Kotlin.lesson4.Abc

/**
 *
 */

fun main() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val resultList = numbers.map { it.length }.filter { it > 3 }
    println(resultList)

    numbers.map {
        it.length }.filter {
        it > 3 }.let {
        println(it)
        }

    val firstAndLast = with(numbers) {
        "Первый элемент списка - ${first()}," +
                " последний элемент списка - ${last()}"
    }
    println(firstAndLast)
}

class ScopeFunction {
    object J {
        @JvmStatic
        fun main(args: Array<String>) {

            /**find let*/
            val list2 = listOf<String>()
            var list: List<String> = arrayListOf()
            println(list2)
            println(list)
            list.find {
                it.isNotEmpty()
            }?.let {
                println(it)
            }

            /**apply*/
            list2.apply {
                get(1)
            }

            /**also*/
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

            /**with
             * Не является функцией-расширением. Контекстный объект передается в качестве аргумента,
             * а внутри лямбда-выражения он доступен как получатель (this). Возвращаемое значение -
             * результат выполнения лямбды.
             *
             * Функцию with рекомендуется использовать для вызова функций контекстного объекта без
             * предоставления результата лямбды. В коде with может читаться как" с этим объектом,
             * сделайте следующее. "
             * */
            val ab = AB.Base()
            ab.one()
            ab.two()

            with(AB.Base()) {
                one()
                two()
            }

            /**let
             * Контекстный объект доступен в качестве аргумента (it).
             * Возвращаемое значение - результат выполнения лямбды.
             *
             * позволяет использовать полученный результат для
             * вызова одной или нескольких функций в блоке кода.
             * */
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

            //run
            AB.Base().run {
                one()

            }
            val ab2: AB? = null
            //run проверяет на null
            ab2?.run {
                one()
            }

            with(ab2) {
                ab2?.one()
            }

        }
        //разница let also, let не может отдать объект
        /*fun getTest(): AB{
            return AB.Base().let {
                it.one()
                it.two()
            }
        }*/

        fun getTest2(): AB {
            return AB.Base().also {
                it.one()
                it.two()
            }
        }

    }
}