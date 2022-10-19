package com.example.myapplication2.Java.lesson25Example2;

public interface Data {
    interface Save<T>{
        void save(T data);
    }
    interface Read<T>{
        T read();
    }

    interface Mutable<T> extends Save<T>, Read<T>{

    }

    /**
     * Опять же это упрощенный пример, геттеры сеттеры в итоге не будут существовать
     */
    class LocalCache<T> implements Mutable<T>{
        private T data;

         @Override
         public void save(T data) {
            this.data = data;
         }

         @Override
         public T read() {
             return data;
         }
     }

     class Repository<T> implements Mutable<T>{
        private final CachedDataSource<T> cachedDataSource;
        private final DataSource<T> cloudDataSource;

         public Repository(CachedDataSource<T> cachedDataSource, DataSource<T> cloudDataSource) {
             this.cachedDataSource = cachedDataSource;
             this.cloudDataSource = cloudDataSource;
         }


         @Override
         public void save(T data) {
            cachedDataSource.saveData(data);
         }

         /**
          * Можно здесь описать логику if else
          * @return
          */
         @Override
         public T read() {
             return cloudDataSource.getData();
         }
     }
}
