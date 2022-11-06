package com.example.myapplication2.Kotlin.lesson3

import com.example.myapplication2.Kotlin.lesson1.addItem

class MainKt {
    object T{
        @JvmStatic
        fun main(args: Array<String>) {
            val callback = Callback.Base()

            var list = mutableListOf(Ajava("1", 1, callback))
            list.addItem(Ajava("2", 2, callback))
            list.addItem(Ajava("2", 2, callback))
            println(list)

            val map = HashMap<Ajava, Int>()
            val hash1 = Ajava("2", 2, callback)
            map.put(hash1, 1)
            println(hash1.hashCode())

            val hash2 = Ajava("2", 2, callback)
            map.put(hash2, 1)
            println(hash2.hashCode())
            map.put(Ajava("2", 2, callback), 1)

            val hash3 = Ajava("2", 4, callback)
            map.put(hash3, 1)
            println(hash3.hashCode())

            println(map)

            callback.log(Logging.Base())

            val set = HashSet<Ajava>()
            set.add(hash1)
            set.add(hash2)
            println(set)


        }
    }
}