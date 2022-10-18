package com.example.myapplication2.Java.lesson25Example2;

/** 1 Наследуемся от общего для всех абстрактного класса, так как от двух не можем отнаследоваться
 * И логика у всех трех классов пока одинаковая
 * Можно сказать используем особенности наследования
 *
 * 2 Так как у репозитория должно быть в итоге метод получения и сохранения, наследуемся от
 * MutableDataSource
 */
public class Repository<T extends CloudObject> implements MutableDataSource<T>{
    private final MutableDataSource<T> cache;
    private final DataSource<T> cloud;

    //Это как корневый интерфейсы, естественно они требуют тип
    public Repository(MutableDataSource<T> cache, DataSource<T> cloud) {
        this.cache = cache;
        this.cloud = cloud;
    }

/**Если данные из кэша не удолось получить, получаем из сети**/
    @Override
    public T getData() {
        T result = cache.getData();
        if (result == null){
            result = cloud.getData();
        }
        return result;
    }

    @Override
    public void saveData(T data) {

        cache.saveData(data);
    }
}
