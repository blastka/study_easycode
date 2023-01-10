package com.example.cars

import java.util.*

abstract class Load

class People(maxCount: Int) : Load()

class Material(volume: Double, weight: Double) : Load()

abstract class Car(
    private val loads: List<Load>,
    private val commonCharacteristics: CommonCharacteristics
) : CommonCar {
    override fun refuel() {
        TODO("Not yet implemented")
    }

    override fun repair() {
        TODO("Not yet implemented")
    }

    abstract fun canBeLoaded(load: Load): Boolean
}

class MaterialsCar(load: Material, commonCharacteristics: CommonCharacteristics) :
    Car(listOf(load), commonCharacteristics), FreightCar {
    override fun sealCargo() {
        TODO("Not yet implemented")
    }

    override fun canBeLoaded(load: Load): Boolean {
        TODO("Not yet implemented")
    }

}

class PassengerCar(load: People, commonCharacteristics: CommonCharacteristics) :
    Car(listOf(load), commonCharacteristics), PassengersCar {
    override fun disinfect() {
        TODO("Not yet implemented")
    }

    override fun canBeLoaded(load: Load): Boolean {
        TODO("Not yet implemented")
    }

}

//а где в итоге то методы disinfect и sealCargo??
class CombinedCar(
    people: People,
    material: Material,
    commonCharacteristics: CommonCharacteristics
) : Car(listOf(people, material), commonCharacteristics) {
    override fun canBeLoaded(load: Load): Boolean {
        TODO("Not yet implemented")
    }
}


class CommonCharacteristics(
    private val productionDate: String,
    private val fuelType: FuelType
)

class HeavyCarCharacteristics(
    private val bodyType: BodyType
)

enum class BodyType {
    PLASTIC
}

interface PassengersCar {
    fun disinfect()
}

interface CommonCar {
    fun refuel()
    fun repair()
}

interface FreightCar : OldCar {
    fun sealCargo()
}

enum class FuelType {
    PETROL,
    DIESEL
}

fun main() {
    val combinedCar = CombinedCar(People(1),
        Material(0.1, 0.2), CommonCharacteristics("Data()", FuelType.PETROL))

}