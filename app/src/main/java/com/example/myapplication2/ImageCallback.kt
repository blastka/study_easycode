package com.example.myapplication2

import android.graphics.Bitmap

interface ImageCallback {
    fun success(bitmap: Bitmap)
    fun failed()
}