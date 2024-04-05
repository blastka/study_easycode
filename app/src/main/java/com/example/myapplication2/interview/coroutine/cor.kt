package com.example.myapplication2.interview.coroutine

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

suspend fun main() {
    val exception = CoroutineExceptionHandler{_, exception ->
        println("ошипка")
    }

       /* val coroutineScope: CoroutineScope = CoroutineScope(Job())
        val b = coroutineScope.launch(SupervisorJob() + exception + Dispatchers.IO) {

                println("start")
                println("${this.coroutineContext}")
                delay(100)
                val ch1 = launch {
                    println("1 ${this.coroutineContext}")
                    throw RuntimeException("Something went wrong in Job 2")

                }
                delay(100)
                val ch2 = launch {
                    println("2 ${this.coroutineContext}")
                }
        }
*/

    val a = GlobalScope
    a.launch(Dispatchers.IO + SupervisorJob()) {
        println("1 1${this.coroutineContext}")
        delay(100)
        launch {
            println("1 2${this.coroutineContext}")
            throw RuntimeException("Something went wrong in Job 2")
        }
        delay(100)
        launch {
            println("1 3${this.coroutineContext}")

        }
        delay(100)
    }

    withContext(Dispatchers.IO) {
        Thread.sleep(1000)
    }
}