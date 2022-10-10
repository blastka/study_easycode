package com.example.myapplication2.Java.Lesson25;

public class MyDataCloudDataSource implements DataSource<MyData> {
    //из-за того, что возращает данные не можем сделать дженерик
    @Override
    public MyData data() {
        return new MyData(1, "description_1");
    }

}
