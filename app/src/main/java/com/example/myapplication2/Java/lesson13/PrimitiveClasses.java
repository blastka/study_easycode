package com.example.myapplication2.Java.lesson13;

public class PrimitiveClasses {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        Boolean a3 = false;
        System.out.println(a == b);//false
        System.out.println(a.equals(b));
        a = 127;
        b = 127;
        System.out.println(a == b);//true 127 примитив
        System.out.println(a.equals(b));
        String d = "a";//не создаются объекты
        String c = "a";
        System.out.println(d == c);
        System.out.println(d.equals(c));

        String d1 = new String("a");//создаются объекты
        String c1 = new String("a");
        System.out.println(d1 == c1);
        System.out.println(d1.equals(c1));
    }
}
