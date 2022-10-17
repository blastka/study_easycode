package com.example.myapplication2.Java.lesson25Example2;

public class Solution {
    /**Нам нужно породить объекты и отдать их в конструктор, в конструкторе принимается тип
     * родителя. Далее так как функция getData делает return, то нужно занести ее в переменную
     */
    public static void main(String[] args) {
        //Почему конструктор требует тип, а сам класс не требует? Потому что в конструкторе
        //интерфейсы, а вызов конструктора кидаются наследники, созданные объекты
        Repository<MyData> repository = new Repository<>(new CachedDataSource<>(), new MyDataCloudDataSource());
        MyData data = repository.getData();

        Repository<MyGeoData> repository1 = new Repository<>(new CachedDataSource<>(), new GeoDataDataSource());
        MyGeoData geoData = repository1.getData();
    }

    public static void print(Object text) {
        System.out.println(text);
    }

}
