package com.example.myapplication2.Java.lesson28.exercise1;

/**
 * Сделаем треугольник по сторанам
 * геттеры для упрощения
 */
public class Triangle{
    private final int ab;
    private final int bc;
    private final int ca;


    protected Triangle(int ab, int bc, int ca) {
        this.ab = ab;
        this.bc = bc;
        this.ca = ca;
    }

    public int getSides1(){
        return ab;
    }

    public int getSides2(){
        return bc;
    }

    public int getSides3(){
        return ca;
    }


}
