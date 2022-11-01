package com.example.myapplication2.Kotlin.lesson2
//класс, который лучше не использовать
sealed class Result {
    class Success(val data: Int): Result()
    class Error(val message: String): Result()
}