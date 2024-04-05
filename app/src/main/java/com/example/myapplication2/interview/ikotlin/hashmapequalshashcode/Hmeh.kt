package com.example.myapplication2.interview.ikotlin.hashmapequalshashcode

class Hmeh {
}

fun main() {
    val hashMap: HashMap<User, Int> = HashMap()
    val oleg = User("Oleg", 23)
    hashMap.set(oleg, 25)
    println(oleg.hashCode())//997110508 основанный на его адресе в памяти.
    val vitya = User("Vitya", 31)
    hashMap.set(vitya, 10)
    println(vitya.hashCode())//509886383
    val vitya12 = User("Vitya", 31)
    hashMap.set(vitya12, 10)
    println(vitya12.hashCode())//1854778591
    println(hashMap)
    println(vitya == vitya12)//сравнение ссылок на объекты
    val hashMap2: HashMap<User2, Int> = HashMap()

    val oleg2 = User2("Oleg", 23)
    hashMap2.set(oleg2, 25)
    println(oleg2.hashCode())//76275864 комбинация хэш-кодов всех свойств объекта.
    val vitya22 = User2("Vitya", 31)
    println(vitya22.hashCode())//-1732315530
    hashMap2.set(vitya22, 31)
    val vitya23 = User2("Vitya", 31)
    println(vitya23.hashCode())//-1732315530
    hashMap2.set(vitya23, 10)
    println(hashMap2)
    println(vitya22 == vitya23)//сравнение внутреннего содержания
}

class User(val name: String, val age: Int)
data class User2(val name: String, val age: Int)

