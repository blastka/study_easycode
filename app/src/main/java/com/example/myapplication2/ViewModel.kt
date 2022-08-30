package com.example.myapplication2

import java.util.*

class ViewModel(private val textObservable: TextObservable) {

    private val model = Model.init(object : TextCallback{
        override fun updateText(str: String) {
            textObservable.postValue(str)
        }

    })

    fun init(){
        Model.start()
    }
}