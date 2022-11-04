package com.example.myapplication2.Kotlin.lesson2.normalSealed

sealed class Result {
    abstract fun handle(handleResult: HandleResult)

    class Success(private val value: Int) : Result() {
        override fun handle(handleResult: HandleResult) {
            handleResult.handleSuccess(value)
        }
    }

    class Error(private val message: String): Result() {
        override fun handle(handleResult: HandleResult) {
            handleResult.handleError(message)
        }
    }
}