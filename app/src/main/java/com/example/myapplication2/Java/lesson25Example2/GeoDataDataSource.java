package com.example.myapplication2.Java.lesson25Example2;

public class GeoDataDataSource implements DataSource<MyGeoData>{
    @Override
    public MyGeoData getData() {
        return new MyGeoData(1, 1.5, 2.6);
    }
}
