package com.example.myapplication2.Kotlin.MyTest
/*
* Вопрос: equals и == в kotlin
* ===
*/

fun main() {
    var first = BigCat(1, 2)
    var second = BigCat(1, 2)
    var hash1 = first.hashCode()
    var hash2 = second.hashCode()
    println("first hashcode " + hash1 + " second hashCode " + hash2)
    println(first == second)
    println(first === second)
    println(first.equals(second))
    second = first
    println("second $second")
    println(first == second)
    println(first === second)
    println(first.equals(second))

    val firstLittleCat = LittleCat(1,2)
    val secondLittleCat = LittleCat(1,2)
    println(firstLittleCat == secondLittleCat)
    println(firstLittleCat.equals(secondLittleCat))
    println(firstLittleCat === secondLittleCat)
    val firstInt: Int? = 300
    val secondInt: Int? = 300
    hash1 = firstInt.hashCode()
    hash2 = secondInt.hashCode()
    println("int")
    println("firstInt hashcode " + hash1 + " secondInt hashCode " + hash2)
    println(firstInt == secondInt)
    println(firstInt === secondInt)
    val firstString = "a"
    val secondString = "a"
    println(firstString == secondString)
    println(firstString === secondString)
}

class BigCat(private val first: Int, private val second: Int){

}

data class LittleCat(private val first: Int, private val second: Int){

}