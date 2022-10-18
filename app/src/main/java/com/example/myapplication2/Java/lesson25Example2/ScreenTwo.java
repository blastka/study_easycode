package com.example.myapplication2.Java.lesson25Example2;
/**
 * Получаем данные
 */
public class ScreenTwo {
    private final Data.Read<Person> repository;

    public ScreenTwo(Data.Read<Person> read) {
        this.repository = read;
    }

    public void show(Show<String> show){
        show.show(repository.read().toString());
    }
}

interface Show<T>{
    void show(T data);
}
