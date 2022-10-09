package com.example.myapplication2.Java.Lesson25;

public class ChangedDataSource implements MutableDataSourse {

    private MyData data;//вместо действий.

    @Override
    public MyData data() {
        return data;
    }

    @Override
    public void saveData(MyData data) {

    }
}
