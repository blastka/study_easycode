package com.example.myapplication2.Kotlin.lesson4

object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        val cat = Cat()
        val dog: Dog = Dog.Base()
        val idog: IDog = IDog()
        val idog2: Dog = IDog()
        val idog3: Animals = IDog()
        idog.sound()
        idog.coco()
        idog.type()
        idog2.sound()
        idog2.sound()
        idog3.type()
        val dogAbstract: Dog = PusDog()
        dogAbstract.sound()
    }
}

class Cat(){

}

interface Dog{
    fun sound()

    class Base: Dog{
        override fun sound() {
            TODO("Not yet implemented")
        }

    }
}
interface Animals{
    fun type()
}

class IDog (): Dog, Animals{
    override fun sound() {
        TODO("Not yet implemented")
    }

    fun coco(){

    }

    override fun type() {
        TODO("Not yet implemented")
    }

}

abstract class AbstractDog: Dog{

    protected abstract fun gav()
}

class PusDog: AbstractDog() {
    override fun gav() {
        TODO("Not yet implemented")
    }

    override fun sound() {
        TODO("Not yet implemented")
    }

}