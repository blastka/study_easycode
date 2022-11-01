package com.example.myapplication2.Kotlin.lesson1.TrableStatic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class B {
    public static void main(String[] args) {
        final Set<Object> result = new HashSet();
                Log log = object -> result.add(object);
        A a = new A(log);
        for (int i = 0; i < 100; i++){
            a.sum(i,2);
        }
        String combined = result + "a called log with 1 2";
        System.out.println(combined);
    }
}
