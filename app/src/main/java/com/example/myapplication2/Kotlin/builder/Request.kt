package com.example.myapplication2.Kotlin.builder

/**
 * Замена билдера
 */

fun main() {

}

interface Request {
    class Base(private val body : String, private val header: String) : Request{

    }

    class AuthRequest(private val body : String = "a", private val header: String): Request{

    }


}