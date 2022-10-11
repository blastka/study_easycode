package com.example.myapplication2.Java.lesson25Example2;

public class Solution {
    /**Нам нужно породить объекты и отдать их в конструктор, в конструкторе принимается тип
     * родителя. Далее так как функция getData делает return, то нужно занести ее в переменную
     */
    public static void main(String[] args) {
        CachedDataSource cache = new CachedDataSource();
        CloudDataSource cloud = new CloudDataSource();
        Repository repository = new Repository(cache, cloud);

        MyData myData = repository.getData();
        print(myData);
    }

    public static void print(Object text) {
        System.out.println(text);
    }

}
