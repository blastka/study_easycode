package com.example.myapplication2.interview.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.zip
import kotlinx.coroutines.runBlocking

fun main() {
   runBlocking {
        flowOf("a ", " B ", "  ", "Ab" )
            .map {
                it.trim() }
            .filter {
                it.isNotEmpty() }
            .collect {
                println(it) }

       val flow = flowOf(1, 2, 3)
       val flow2 = flowOf("a", "b", "c", "d")
       flow.zip(flow2) { i, s -> i.toString() + s }.collect {
           println(it) // Will print "1a 2b 3c"
       }
    }

}