package com.example.myapplication2.Java.lesson25Example2;

/**
 * Записываем данные
 */
public class ScreenOne {
    private final Data.Save<Person> save;

    public ScreenOne(Data.Save<Person> save) {
        this.save = save;
    }

    public void saveName(String name){
        save.save(new Person(name));
    }
}
