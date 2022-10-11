package com.example.myapplication2.Java.lesson25Example2;

public class Repository extends DataSource{
    private final DataSource cache;
    private final DataSource cloud;

    public Repository(DataSource cache, DataSource cloud) {
        this.cache = cache;
        this.cloud = cloud;
    }


    @Override
    MyData getData() {
        return null;
    }

    @Override
    void saveData(MyData data) {

    }
}
