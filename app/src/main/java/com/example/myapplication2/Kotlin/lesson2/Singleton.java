package com.example.myapplication2.Kotlin.lesson2;

/**
 * Паттерн не нужный в андроиде
 */
public class Singleton {
    private static Singleton sSingleton;

    public static Singleton getInstance(){
        if (sSingleton == null){
            sSingleton = new Singleton();
        }
        return sSingleton;
    }

    private Singleton(){
        System.out.println("constructor singleton called");
    }

}
