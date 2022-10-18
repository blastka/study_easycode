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

        //так можно переиспользовать для разных данных репозиторий
        GeoRepository repository1 = new GeoRepository(new GeoCache(), new GeoDataDataSource());
        MyGeoData geoData = repository1.getData();

        //Можно использовать анонимные классы таким образом, "создав класс без названия" и
        //порадив объект DataSource<Person>, заимплементировав здесь метод
        Repository<Person> repository2 = new Repository<>(new CachedDataSource<>(), new DataSource<Person>() {
            @Override
            public Person getData() {
                return null;
            }
        });
    }

    public static void print(Object text) {
        System.out.println(text);
    }

}
