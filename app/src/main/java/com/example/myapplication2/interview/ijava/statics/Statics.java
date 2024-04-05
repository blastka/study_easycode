package com.example.myapplication2.interview.ijava.statics;

public class Statics {
    public static final String a = "a";
    private final int b;
    private static final String t = "t";
    static String g = "g";
    final static String g1 = "g1";

    public Statics(int b) {
        this.b = b;
    }

    public static void showStatic(){
        System.out.println(a + t);
    }

    public static void showStaticG(){
        System.out.println("showStaticG " + g);
        System.out.println("showStaticG " + t);
        System.out.println("showStaticG " + a);
    }

    public void show(){
        System.out.println(b);
        System.out.println(g1);
        System.out.println(g);
        System.out.println(t);
    }

    public void showG(){
        System.out.println("showG " + g);
    }
}
