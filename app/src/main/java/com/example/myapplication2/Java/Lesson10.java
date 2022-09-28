package com.example.myapplication2.Java;

public class Lesson10 {
    public static void main(String[] args){
        choice(true,true);
        choice(true,false);
        choice(false,false);
        choice(false,true);
    }

    public static void choice(boolean isTodayFriday, boolean aLotOfMoney){
        if (isTodayFriday && aLotOfMoney){
            System.out.println("выпить пивка");
        } else if (isTodayFriday){
            System.out.println("попросить в долг у друга и пойти с ним попить пивка");
        }else
            System.out.println("пойти домой и поесть гречи");
    }

}
