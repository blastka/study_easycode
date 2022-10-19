package com.example.myapplication2.Java.lesson6;

public class lesson6 {
    public static void main(String[] args){
        final String first = "Hi";
        final String second = "I am Sveta";
        String result = sum(first, second);
        show(result);
        //first = "gdgdf"//error
    }

    public static String sum(String first, String second){
        return first +"\n"+ second;
    }

    public static void show(String number){
        System.out.println(number);
    }
}
