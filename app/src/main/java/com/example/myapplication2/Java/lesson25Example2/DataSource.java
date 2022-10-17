package com.example.myapplication2.Java.lesson25Example2;

/**
 * Вместо абстрактных классов в итоге сделали интерфейсы и так как один интерфейс MutableDataSource
 * для изменяемых
 * данных, а второй DataSource только для чтения, то для интерфейса изменяемых данных
 * MutableDataSource добавим
 * наследование от этого интерфейса. Это называется сегрегацией интерфейсов.
 * **/
public interface DataSource<T> {
    T getData();
}
