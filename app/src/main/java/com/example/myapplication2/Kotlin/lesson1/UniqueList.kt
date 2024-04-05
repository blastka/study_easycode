package com.example.myapplication2.Kotlin.lesson1

class UniqueList<T> : ArrayList<T>() {
    override fun add(element: T): Boolean {
        var result = false
        if (!contains(element)){
            result = super.add(element)
        }
        return result
    }
}
