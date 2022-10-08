package com.example.myapplication2.Java.Lesson21;

public class Rectangle extends Figure {


    protected Rectangle(double a, double b) {
        super(new double[]{a, b});
    }

    @Override
    public double getArea() {
        return sides[0] * sides[1];
    }

    @Override
    public double getPerimeter() {
        return 2 * super.getPerimeter();
    }


    @Override
    public String toString() {
        return getType() + " " + "площадь" + getArea();
    }

    @Override
    protected String getType() {
        return "Прямоугольник";
    }
}
