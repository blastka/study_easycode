package com.example.myapplication2.Java.lesson25Example2;

public class CloudDataSource extends DataSource{
    @Override
    public MyData getData() {
        return new MyData(1,"cloud");
    }

    @Override
    public void saveData(MyData data) {

    }
}
