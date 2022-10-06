package com.example.myapplication2.Java.Lessin20;

public class Triangle {
    private final int a;
    private final int b;
    private final int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(){
        this(8,7,3);
    }

    public void showSides(){
        System.out.println(a +"+"+ b +"+"+ c);
    }
}
