package com.example.myapplication2.Kotlin.lesson2.normalSealed

 interface Repository {
    fun data(): Result

    class Base: Repository {
        override fun data(): Result {
            return if (System.currentTimeMillis() > 10000){
                Result.Success(10000)
            }else
                return Result.Error("oops")
        }

    }
}