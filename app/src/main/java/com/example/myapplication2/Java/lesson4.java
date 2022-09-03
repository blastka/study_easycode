package com.example.myapplication2.Java;

public class lesson4 {

    public static void main(String[] args) {
        int first = 5;
        int second = 6;
        int result = sum(first, second);
        show(result);
    }

    public static int sum(int first, int second){
        return first + second;
    }

    public static void show(int number){
        System.out.println(number);
    }
}
