package com.example.myapplication2.Java.Lesson25;

public interface MutableDataSourse<T> extends DataSource<T>{
    void saveData(T data);
}
