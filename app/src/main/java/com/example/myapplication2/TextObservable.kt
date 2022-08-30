package com.example.myapplication2

import com.google.android.material.resources.TextAppearanceFontCallback

class TextObservable {
    private lateinit var callback: TextCallback

    fun observe(callback: TextCallback){
        this.callback = callback
    }

    fun postValue(text: String){
        callback.updateText(text)
    }
}

