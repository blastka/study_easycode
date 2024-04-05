package com.example.myapplication2.interview.ikotlin

fun main() {
    val cat = Cat("Masya")
    println(cat.age)
    cat.nameAge(8)
    println(cat.age)
}

fun Cat.nameAge(age: Int){
    this.age = age
}

class Cat(private val name: String){
    private val may: String = "May"
    protected val sherts = "White"
    var age: Int = 0

    fun getName(): String{
        return name
    }
}