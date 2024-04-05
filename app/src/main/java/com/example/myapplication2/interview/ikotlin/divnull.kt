package com.example.myapplication2.interview.ikotlin

import org.junit.Test

fun main() {


        try {
            println(1 / 0)
        }catch (e: Throwable)
        {
            println("error")
        }

}