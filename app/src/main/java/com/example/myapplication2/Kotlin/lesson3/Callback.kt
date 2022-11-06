package com.example.myapplication2.Kotlin.lesson3

interface Callback {
    fun hashCodeCalled()
    fun equalsCalled()
    fun log(log: Logging)

    class Base(): Callback{
        private var hashCodeCalledCount = 0
        private var equalsCalledCount = 0

        override fun hashCodeCalled() {
            hashCodeCalledCount++
        }

        override fun equalsCalled() {
            equalsCalledCount++
        }

        override fun log(log: Logging) {
            log.log("hashCodeCalledCount $hashCodeCalledCount equalsCalledCount $equalsCalledCount")
        }


    }
}