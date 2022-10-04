package com.example.myapplication2.Java.Lessin20;

public class Lesson20 {
    public static void main(String[] args) {
        TriangleValidation triangleValidation = new TriangleValidation(1,2,3);
        if (triangleValidation.areValid()){
            Triangle triangle = triangleValidation.makeTriangle();
        }
    }
}
