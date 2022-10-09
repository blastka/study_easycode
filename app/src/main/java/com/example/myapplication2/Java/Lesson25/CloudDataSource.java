package com.example.myapplication2.Java.Lesson25;

public class CloudDataSource implements DataSource {
    @Override
    public MyData data() {
        return new MyData(1, "description_1");
    }

}
