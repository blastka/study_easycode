package com.example.cars

/**
 * Общие методы это заправить и отремонтировать
 * свои методы это продезенфицировать и опломбировать
 *
 */
interface OldCar {
    fun refuel()
    fun repair()

    abstract class AbstractCar: OldCar{
        override fun refuel() {
            TODO("заправить")
        }

        override fun repair() {
            TODO("ремонтировать")
        }
    }

    interface FreightCar: OldCar {
        fun sealCargo()

        abstract class Abstract:OldCar.AbstractCar(), FreightCar{
            override fun sealCargo() {
                TODO("обломбировать")
            }
        }
    }

    interface PassengerCar: OldCar{
        fun disinfect()

        abstract class AbstractPassengerCar: PassengerCar{
            override fun disinfect() {
                TODO("дезенфицировать")
            }
        }
    }

    //у них общая реализация
    interface CargoPassengerCar : FreightCar, PassengerCar{
        /*class Base(): CargoPassengerCar, FreightCar.Abstract(), PassengerCar.AbstractPassengerCar(){

        }*/
    }


}