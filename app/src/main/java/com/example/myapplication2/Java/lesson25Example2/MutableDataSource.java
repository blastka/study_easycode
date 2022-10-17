package com.example.myapplication2.Java.lesson25Example2;

/**
 * Это называется сегрегацией интерфейсов, для исключения повторений методов.
 */
public interface MutableDataSource<T> extends DataSource<T>{
    void saveData(T data);
}
