package com.example.myapplication2.interview.ikotlin

fun main() {
    val a = {::foo}
    println(a.invoke())
    println(a)
    val b = {::foo}
    println(a == b)
}

fun foo() = 5

