package com.example.myapplication2.Java.lesson25Example2;

/**
 * Для примера вернем объект MyData с какими-то данными.
 * 2 Здесь определенный тип данных, не можем использовать обобщения в классе в этом случае, поэтому
 * отдаем в DataSource MyData и
 * переименуем с CloudDataSource на MyDataCloudDataSource
 */

public class MyDataCloudDataSource implements DataSource<MyData>{
    @Override
    public MyData getData() {
        return new MyData(1, "fhf");
    }

}
