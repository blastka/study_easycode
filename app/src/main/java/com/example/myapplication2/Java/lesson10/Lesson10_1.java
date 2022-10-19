package com.example.myapplication2.Java.lesson10;

public class Lesson10_1 {
    public static void main(String[] args){
        choice(20,100, 100);
        choice(20,100, 120);
        choice(20,100, 20);
        choice(20,100, 0);
    }

    public static void choice(int beer, int whiskey, int money){
        if (money >= (beer + whiskey)){
            System.out.println("выпить пива и виски");
        }
        else if (money >= whiskey){
            System.out.println("выпить виски");
        }
        else if (money >= beer){
            System.out.println("выпить пива");
        }
        else{
            System.out.println("уходим плакать домой");
        }
    }
}
