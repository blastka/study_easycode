package com.example.myapplication2.Java.lesson25Example2;

public class CloudDataSource implements DataSource{
/**
 * Для примера вернем объект MyData с какими-то данными.
 */
    @Override
    public MyData getData() {

        return new MyData(1,"cloud");
    }

}
