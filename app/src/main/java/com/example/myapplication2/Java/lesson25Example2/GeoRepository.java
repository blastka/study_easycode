package com.example.myapplication2.Java.lesson25Example2;

public class GeoRepository extends Repository<MyGeoData>{
    public GeoRepository(MutableDataSource<MyGeoData> cache, DataSource<MyGeoData> cloud) {
        super(cache, cloud);
    }
}
