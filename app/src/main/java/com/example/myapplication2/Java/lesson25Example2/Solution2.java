package com.example.myapplication2.Java.lesson25Example2;

public class Solution2 {
    public static void main(String[] args) {

        Data.Mutable<Person> repository = new Data.Repository<>(new CachedDataSource<>(), new DataSource<Person>() {
            @Override
            public Person getData() {
                return null;
            }
        });
        ScreenOne screenOne = new ScreenOne(repository);
        ScreenTwo screenTwo = new ScreenTwo(repository);

        screenOne.saveName("Johny");
        screenTwo.show(new Show<String>() {
            @Override
            public void show(String data) {
                System.out.println(data);
            }
        });
    }
}
