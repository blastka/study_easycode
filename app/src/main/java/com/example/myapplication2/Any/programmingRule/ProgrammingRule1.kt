package com.example.myapplication2.Any

/**
 * Методы должны быть public и override
 * Декларация методов должна быть в интерфейсе
 */

interface CloudRepository {
    suspend fun fetch() : String

    class Base() : CloudRepository {
        override suspend fun fetch(): String {
            TODO("Not yet implemented")
        }
    }
}