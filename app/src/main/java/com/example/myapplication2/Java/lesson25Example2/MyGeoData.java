package com.example.myapplication2.Java.lesson25Example2;

public class MyGeoData extends CloudObject{
    private final int id;
    private final double longtube;
    private final double latitube;

    public MyGeoData(int id, double longtube, double latitube) {
        this.id = id;
        this.longtube = longtube;
        this.latitube = latitube;
    }

    @Override
    public String toString() {
        return "MyGeoData{" +
                "id=" + id +
                ", longtube=" + longtube +
                ", latitube=" + latitube +
                '}';
    }
}
