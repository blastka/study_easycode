package com.example.myapplication2.Java.lesson25Example2;

public class CachedDataSource extends DataSource{
    /**Для примера вернем объект MyData с какими-то данными**/
    @Override
    public MyData getData() {
        return new MyData(1,"cache");
    }

    @Override
    public void saveData(MyData data) {

    }

}
