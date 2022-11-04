package com.example.myapplication2.Kotlin.lesson2.normalSealed

interface HandleResult {
    fun handleSuccess(x: Int)
    fun handleError(message: String)
}