package com.example.myapplication2.Kotlin.lesson2.badSealed
//класс, который лучше не использовать в таком виде
sealed class Result {
    class Success(val data: Int): Result()
    class Error(val message: String): Result()
}