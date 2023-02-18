package com.example.myapplication2.Java.mySolution.equals;

/*
* Вопрос: equals и == в java
 */

public class Equals {
    public static void main(String[] args) {
        Integer first = 128;
        Integer second = 128;
        System.out.println("Integer > 127");
        System.out.println(first == second);//Сылки разные false
        System.out.println(first.equals(second));//содержимое одинаковое true

        Integer first1 = 1;
        Integer second1 = 1;
        System.out.println("Integer < 127");
        System.out.println(first1 == second1);//Сылки одинаковые, примитивы до 128 true
        System.out.println(first1.equals(second1));//содержимое true

        int first2 = 5;
        int second2 = 5;
        System.out.println("int primitives");
        System.out.println(first2 == second2);//содержимое
        //equals вообще нет

        String a = "a";
        String b = "a";
        System.out.println("String primitives");
        System.out.println(a == b);//ссылки одинаковые? true
        System.out.println(a.equals(b));//содержимое true

        System.out.println("String new");
        String a1 = new String("a"); //точно разные объекты
        String b1 = new String("a");
        System.out.println(a1 == b1);//ссылки разные false
        System.out.println(a1.equals(b1));//содержимое одинаковое true
    }
}