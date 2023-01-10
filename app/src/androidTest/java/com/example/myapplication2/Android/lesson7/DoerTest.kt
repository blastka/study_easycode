package com.example.myapplication2.Android.lesson7

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test


internal class DoerTest{
    private lateinit var logger: TestLogging
    private lateinit var doer: Doer

    @Before
    fun setUp(){
        logger = TestLogging()
        doer = Doer(logger)
    }
    @After
    fun clear(){
        logger.logCallsCount = 0
    }

    @Test
    fun test_one_time_case(){
        doer.doMain()
        val actual = logger.logCallsCount
        val expected = 1
        assertEquals(expected, actual)
    }

    @Test
    fun test_two_time_case(){
        val logger = TestLogging()
        val doer = Doer(logger)
        doer.doMain()
        doer.doMain()
        val actual = logger.logCallsCount
        val expected = 1
        assertEquals(expected, actual)
    }

    private inner class TestLogging: Logging{
        var logCallsCount = 0

        override fun log(text: String) {
            logCallsCount++
        }

    }
}