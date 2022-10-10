package com.example.myapplication2.Java.Lesson25;

public class CacheDataSource<T> implements MutableDataSourse<T> {

    private T data;//вместо действий.

    @Override
    public T data() {
        return data;
    }

    @Override
    public void saveData(T data) {
        this.data = data;
    }
}
