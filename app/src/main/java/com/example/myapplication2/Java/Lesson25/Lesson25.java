package com.example.myapplication2.Java.Lesson25;

public class Lesson25 {
    Repository<MyData> repository = new Repository<>(new MyDataCloudDataSource(),
            new CacheDataSource<>());
    MyData data = repository.data();
}
