package com.example.myapplication2.Android.lesson7

class Doer(private val logging: Logging) {
    private var mainThingDone = false

    fun doMain(){
        if (!mainThingDone){
            logging.log("main thing done")
            mainThingDone = true
        }
    }
}