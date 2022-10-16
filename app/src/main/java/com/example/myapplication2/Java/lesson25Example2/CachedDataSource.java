package com.example.myapplication2.Java.lesson25Example2;

public class CachedDataSource implements MutableDataSource {
    /**
     * Реализуем приватное свойство для примера. Это не геттеры сеттеры. Далее они должны были бы
     * замениться на методы получения/сохранения данных.
     * Этот класс кеш, в него можно сохранять данные, поэтому отнаследуемся от
     * MutableDataSource
     * **/
    private MyData myData;

    @Override
    public MyData getData() {
        return myData;
    }

    @Override
    public void saveData(MyData data) {
        myData = data;
    }

}
