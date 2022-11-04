package com.example.myapplication2.Kotlin.lesson2

import com.example.myapplication2.Kotlin.TDDlesson2.Numbers

class Construct {
    object J {
        @JvmStatic
        fun main(args: Array<String>) {
            val simpleClass = SimpleClass("1")
        }
    }
}

class SimpleClass{
    private var data: Int = 0

    constructor(txt: String = "") : this(txt.length) {
        data = txt.length
        println(txt)
    }

    constructor(number: Int) {
        data = number
        println(number)
    }

}