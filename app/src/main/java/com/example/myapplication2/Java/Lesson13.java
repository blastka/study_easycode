package com.example.myapplication2.Java;

public class Lesson13 {

    public static void main(String[] args) {
        isRectangle(new int[]{1,3,5,8});
        isRectangle(new int[]{3,3,3,3});
        isRectangle(new int[]{5,3,5,3});
        isRectangle(new int[]{1,3,5,8});
    }

    public static void isRectangle(int[] sides) {
        if (sides[0] == sides[1] && sides[1] == sides[2] && sides[2] == sides[3]){
            System.out.println("Квадрат");
        } else if (sides[0] == sides[2] && sides[1] == sides[3]){
            System.out.println("Прямоугольник");
        } else
            System.out.println("Четырехугольник");
    }
}
