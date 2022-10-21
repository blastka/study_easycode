package com.example.myapplication2.Java.lesson28.exercise1;

public class IsoscelesTriangle implements Square {
    @Override
    public float calculate(Triangle triangle) {
        float h = 2;
        return 0.5f * h * triangle.getSides1();//не стала выводить формулу
    }

}
