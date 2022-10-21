package com.example.myapplication2.Java.lesson28.exercise1;

public class RightTriangle implements Square {

    @Override
    public float calculate(Triangle triangle) {
        return (float) ((triangle.getSides1() * triangle.getSides2()) / 2);//не стала выводить формулу
    }
}
