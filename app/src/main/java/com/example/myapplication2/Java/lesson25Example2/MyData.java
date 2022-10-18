package com.example.myapplication2.Java.lesson25Example2;

public class MyData extends CloudObject{
    private final int id;
    private final String description;

    public MyData(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
