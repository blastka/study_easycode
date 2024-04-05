package com.example.myapplication2.interview.ikotlin

import android.annotation.SuppressLint

/*
    aabbf -> ответ 4
    aabbff -> -1
    abf -> 0
 */

class Quest1 {
    @SuppressLint("NewApi")
    fun inp(str: String): Int {
        val map = mutableMapOf<Char, Int>()
        str.forEach { char ->
            map[char] = map.getOrDefault(char, 0) + 1
        }
        str.forEachIndexed { index, c ->
            if (map[c] == 1) {
                return index
            }
        }
        return -1
    }
}

fun main(){
    Quest1().inp("aabbf")
    Quest1().inp("aabbff")
    Quest1().inp("abf")
}