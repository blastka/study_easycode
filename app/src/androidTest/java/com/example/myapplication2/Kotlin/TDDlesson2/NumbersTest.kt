package com.example.myapplication2.Kotlin.TDDlesson2

import org.junit.Assert
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class NumbersTest{
    @Test
    fun testSum(){
        val numbers = Numbers.Base(12,4)
        val actual = numbers.sum()
        val expected = 16
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testDifference(){
        val numbers = Numbers.Base(12,4)
        val actual = numbers.difference()
        val expected = 8
        Assert.assertEquals(expected, actual)
    }
}