package com.example.myapplication2

import java.util.*

class ViewModel(private val textObservable: TextObservable) {

    private val model = Model(object : TextCallback{
        override fun updateText(str: String) {
            textObservable.postValue(str)
        }

    })


    fun init(){
        model.start()
    }
}