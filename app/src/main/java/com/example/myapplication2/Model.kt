package com.example.myapplication2

import java.util.*

object Model {
    private lateinit var textCallback: TextCallback
    private var timer: Timer? = null
    private var count = 0

    fun init(callback: TextCallback){
        textCallback = callback
    }

    fun start(){
        timer?.cancel()
        timer = Timer()
        timer?.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                count++
                textCallback.updateText(count.toString())
            }
        }, 100,1000)

    }

}