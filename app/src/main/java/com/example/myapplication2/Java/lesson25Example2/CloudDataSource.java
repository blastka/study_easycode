package com.example.myapplication2.Java.lesson25Example2;

public class CloudDataSource extends DataSource{
    @Override
    MyData getData() {
        return new MyData(1,"cloud");
    }

    @Override
    void saveData(MyData data) {

    }
}
