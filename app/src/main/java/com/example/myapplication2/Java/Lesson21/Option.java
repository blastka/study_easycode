package com.example.myapplication2.Java.Lesson21;

public class Option {
    private final String description;
    private final boolean isChosen;


    public Option(String description, boolean isChosen) {
        this.description = description;
        this.isChosen = isChosen;
    }

    public Option(Option old, boolean isChosen) {//если нужно у объекта поменять значение, то нужно
        //сделать новый объект, а не менять у старого
        this.description = old.description;
        this.isChosen = isChosen;
    }
}
