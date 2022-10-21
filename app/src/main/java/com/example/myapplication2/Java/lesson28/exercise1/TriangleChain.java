package com.example.myapplication2.Java.lesson28.exercise1;

public class TriangleChain implements Square{

    private final Triangle triangle;
    private  TriangleChain nextTriangleChain;

    public TriangleChain(Triangle triangle) {
        this.triangle = triangle;
    }


    @Override
    public float calculate(Triangle triangle) {
        return 0;
    }

    public void setNextTriangleChain(TriangleChain nextTriangleChain) {
        this.nextTriangleChain = nextTriangleChain;
    }
}
