package com.example.myapplication2.Java.lesson25Example2;

public class Person extends CloudObject{
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
