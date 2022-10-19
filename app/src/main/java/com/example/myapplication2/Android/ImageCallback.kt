package com.example.myapplication2.Android

import android.graphics.Bitmap

interface ImageCallback {
    fun success(bitmap: Bitmap)
    fun failed()
}