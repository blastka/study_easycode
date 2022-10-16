package com.example.myapplication2.Java.lesson25Example2;

/**
 * Это называется сегрегацией интерфейсов, для исключения повторений методов.
 */
public interface MutableDataSource extends DataSource{
    void saveData(MyData data);
}
