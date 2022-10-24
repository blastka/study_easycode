package com.example.myapplication2.Kotlin.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("1");
        MainKt.addItem(a, "h");//в итоге этот метод не доступен, только через MainKt
    }
}
