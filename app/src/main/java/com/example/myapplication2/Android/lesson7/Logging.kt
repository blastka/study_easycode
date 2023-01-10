package com.example.myapplication2.Android.lesson7

interface Logging {
    fun log(text: String)

    class Base(): Logging{
        override fun log(text: String) {
            println(text)
        }

    }
}