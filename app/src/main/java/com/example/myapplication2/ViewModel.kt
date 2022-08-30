package com.example.myapplication2

import java.util.*

class ViewModel(private val model: Model) {

    private var textObservable: TextObservable? = null

    private val textCallback = object : TextCallback {
        override fun updateText(str: String) {
            textObservable?.postValue(str)
        }

    }

    fun init(textObservable: TextObservable){
        this.textObservable = textObservable
        model.start(textCallback)
    }

    fun clear(){
        textObservable = null
    }
}
