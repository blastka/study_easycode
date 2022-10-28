package com.example.myapplication2.Kotlin.lesson2;

public class Solution {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton = Singleton.getInstance();
    }

}
