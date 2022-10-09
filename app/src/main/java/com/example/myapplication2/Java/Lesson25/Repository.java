package com.example.myapplication2.Java.Lesson25;

import org.jetbrains.annotations.NotNull;

public class Repository implements MutableDataSourse {
    @NotNull
    private final DataSource cloud;
    @NotNull
    private final MutableDataSourse cache;

    public Repository(@NotNull DataSource cloud, @NotNull MutableDataSourse cache) {
        this.cloud = cloud;
        this.cache = cache;
    }


    @Override
    public MyData data() {
        MyData data = cache.data();
        if(data == null){
            data = cloud.data();
        }
        return data;
    }

    @Override
    public void saveData(MyData data) {
        cache.saveData(data);
    }
}
