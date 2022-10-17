package com.example.myapplication2.Java.lesson25Example2;

/**
 * Для примера вернем объект MyData с какими-то данными.
 * 2 Здесь определенные тип данных, переименуем с CloudDataSource на MyDataCloudDataSource
 */

public class MyDataCloudDataSource implements DataSource<MyData>{
    @Override
    public MyData getData() {
        return new MyData(1, "fhf");
    }

}
