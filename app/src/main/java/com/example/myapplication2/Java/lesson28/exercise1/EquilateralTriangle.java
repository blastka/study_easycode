package com.example.myapplication2.Java.lesson28.exercise1;

public class EquilateralTriangle implements Square {
    @Override
    public float calculate(Triangle triangle) {
        return triangle.getSides1() * triangle.getSides2() * triangle.getSides3();//не стала выводить формулу
    }
}
