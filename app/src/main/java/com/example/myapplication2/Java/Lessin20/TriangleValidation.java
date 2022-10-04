package com.example.myapplication2.Java.Lessin20;

public class TriangleValidation {
    private final int a;
    private final int b;
    private final int c;

    public TriangleValidation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean areValid(){
        return a > 0 && b > 0 && c > 0;
    }

    public Triangle makeTriangle(){
        return new Triangle(a,b,c);
    }

}
