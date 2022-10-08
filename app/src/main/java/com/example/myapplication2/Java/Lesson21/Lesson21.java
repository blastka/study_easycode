package com.example.myapplication2.Java.Lesson21;

public class Lesson21 {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(1.2);
        figures[1] = new Rectangle(5,6);
        figures[2] = new Triangle(3,4,5);
        //User user = new User.Premium();
        for (Figure figure : figures){
            System.out.println(figure.toString());
        }

    }

}
