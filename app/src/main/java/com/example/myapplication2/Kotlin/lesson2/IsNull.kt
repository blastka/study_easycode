package com.example.myapplication2.Kotlin.lesson2

class IsNull {
    object Main{
        @JvmStatic
        fun main(args: Array<String>) {
            var x: Any? = null
            /*if(x is String){//Только String

            }
            if (x is String?){//String или null

            }*/
            x = 5
            println((x as? String))//null, если не стринг или null и если String
            //if (x instanceof Sting)

            println((x as? String))
            //Если null или String, если другой тип то краш*/
            println( (x as String?)?.length)
            //Если null или String, если другой тип то краш*/
        }
    }
}