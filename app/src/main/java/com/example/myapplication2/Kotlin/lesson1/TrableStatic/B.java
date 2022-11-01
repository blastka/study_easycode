package com.example.myapplication2.Kotlin.lesson1.TrableStatic;

import java.util.ArrayList;

public class B {
    public static void main(String[] args) {
        final ArrayList result = new ArrayList();
                Log log = object -> result.add(object);
        A a = new A(log);
        for (int i = 0; i < 100; i++){
            a.sum(i,2);
        }
        String combined = result + "a called log with 1 2";
        System.out.println(combined);
    }
}
