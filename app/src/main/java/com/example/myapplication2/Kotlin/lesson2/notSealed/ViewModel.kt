package com.example.myapplication2.Kotlin.lesson2.notSealed

interface ViewModel {
    fun init()

    class Base(
        private val repository: Repository,
        private val handleError: HandleError
        ) : ViewModel {
        private val handleResult = object : HandleResult {
            override fun handleSuccess(x: Int) {
                //livedata.postvalue(x)
            }

            override fun handleError(message: String) {
                handleError.handle(message)
            }

        }

        override fun init() {
            repository.data().handle(handleResult)
        }

    }
}