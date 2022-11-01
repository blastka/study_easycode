package com.example.myapplication2.Kotlin.lesson2

class Main {
    //код, который лучше не использовать
    object R{
        @JvmStatic
        fun main(args: Array<String>) {
            val repository = object : Repository{
                override fun getData(): Result {
                    TODO("Not yet implemented")
                }
            }
            when (val result = repository.getData()){
                is Result.Success -> println(result.data)
                is Result.Error -> throw IllegalStateException()
                //так как проверка на instance
            }
        }
    }
}