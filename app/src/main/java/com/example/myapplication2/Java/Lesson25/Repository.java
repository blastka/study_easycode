package com.example.myapplication2.Java.Lesson25;

import org.jetbrains.annotations.NotNull;

public class Repository<T> implements MutableDataSourse<T> {
    @NotNull
    private final DataSource<T> cloud;
    @NotNull
    private final MutableDataSourse<T> cache;

    public Repository(@NotNull DataSource<T> cloud, @NotNull MutableDataSourse<T> cache) {
        this.cloud = cloud;
        this.cache = cache;
    }


    @Override
    public T data() {
        T data = cache.data();
        if(data == null){
            data = cloud.data();
        }
        return data;
    }

    @Override
    public void saveData(T data) {
        cache.saveData(data);
    }
}
