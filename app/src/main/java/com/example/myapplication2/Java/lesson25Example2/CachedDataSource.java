package com.example.myapplication2.Java.lesson25Example2;

public class CachedDataSource<T> implements MutableDataSource<T> {
    /**
     * Реализуем приватное свойство для примера. Это не геттеры сеттеры. Далее они должны были бы
     * замениться на методы получения/сохранения данных.
     * Этот класс кеш, в него можно сохранять данные, поэтому отнаследуемся от
     * MutableDataSource
     * **/
    private T myData;

    @Override
    public T getData() {
        return myData;
    }

    @Override
    public void saveData(T data) {
        myData = data;
    }

}
