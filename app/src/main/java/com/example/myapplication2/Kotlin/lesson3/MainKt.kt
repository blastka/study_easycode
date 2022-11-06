package com.example.myapplication2.Kotlin.lesson3

import com.example.myapplication2.Kotlin.lesson1.addItem

class MainKt {
    object T{
        @JvmStatic
        fun main(args: Array<String>) {
            var list = mutableListOf(Ajava("1",1))
            list.addItem(Ajava("2", 2))
            list.addItem(Ajava("2", 2))
            println(list)

            val map = HashMap<Ajava, Int>()
            val hash1 = Ajava("2", 2)
            map.put(hash1, 1)
            println(hash1.hashCode())

            val hash2 = Ajava("2", 2)
            map.put(hash2, 1)
            println(hash2.hashCode())
            map.put(Ajava("2", 2), 1)

            val hash3 = Ajava("2", 4)
            map.put(hash3, 1)
            println(hash3.hashCode())

            println(map)

            val set = HashSet<Ajava>()
            set.add(hash1)
            set.add(hash2)
            println(set)
        }
    }
}