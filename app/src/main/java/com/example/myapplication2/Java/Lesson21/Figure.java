package com.example.myapplication2.Java.Lesson21;

import java.util.Arrays;

public abstract class Figure {

    final String type;

    protected final double[] sides;

    protected String getType(){
        return getClass().getSimpleName();
    }
    protected Figure(double[] sides) {
        this.type = getType();
        this.sides = sides;
    }

    public double getPerimeter(){
        double parameter = 0;
        for (double side : sides){
            parameter += side;
        }
        return parameter;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Figure{" +
                "type='" + type + '\'' +
                ", sides=" + Arrays.toString(sides) +
                '}';
    }
}
