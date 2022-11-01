package com.example.myapplication2.Kotlin.TDDlesson2

import android.provider.Settings
import org.junit.Assert
import org.junit.Test
import java.lang.Double.POSITIVE_INFINITY

internal class NumbersTest{
    @Test
    fun testSumLong(){
        val numbers = Numbers.Base(2_000_000_000,147483648)
        val isSumLong = numbers.isSumLong()
        val expected = true
        Assert.assertEquals(expected, isSumLong)
        val actual: Long = numbers.sumLong()
        val expectedNumber: Long = Int.MAX_VALUE + 1L
        Assert.assertEquals(expectedNumber, actual)
    }

    @Test
    fun testSumInt(){
        val numbers = Numbers.Base(2_000_000_000,147483647)
        val isSumLong = numbers.isSumLong()
        val expected = false
        Assert.assertEquals(expected, isSumLong)
        val actual: Int = numbers.sumInt()
        val expectedNumber: Int = Int.MAX_VALUE
        Assert.assertEquals(expectedNumber, actual)
    }

    @Test(expected = IllegalStateException::class)
    fun testSumIntNoCheck(){
        val numbers = Numbers.Base(2_000_000_000,2_000_000_000)
        numbers.sumInt()
    }

    @Test(expected = IllegalStateException::class)
    fun testSumLongNoCheck(){
        val numbers = Numbers.Base(2_000_000_000,2_000_000_000)
        numbers.sumLong()
    }

    @Test
    fun testDifference(){
        val numbers = Numbers.Base(12,4)
        val actual = numbers.difference()
        val expected = 8
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testDivide(){
        val numbers = Numbers.Base(12,4)
        val actual = numbers.divide()
        val expected = 3.0
        Assert.assertEquals(expected, actual, 0.0001)
    }

    @Test
    fun testDivideDouble(){
        val numbers = Numbers.Base(10,4)
        val actual = numbers.divide()
        val expected = 2.5
        Assert.assertEquals(expected, actual, 0.0001)
    }

    @Test
    fun testDivideZero(){
        val numbers = Numbers.Base(10,0)
        val actual = numbers.divide()
        val expected = POSITIVE_INFINITY
        Assert.assertEquals(expected, actual, 0.0001)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testDivideZeroTwo(){
        val numbers = Numbers.Base(3,0)
        numbers.divide()
    }

}