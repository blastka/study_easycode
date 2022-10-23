package com.example.myapplication2.Any

/**
 * Свойства должны быть приватными private
 * Зависимости должны приходить в конструктор как интерфейсы DataSource, MutableDataSource
 */
class ProgrammingRule2 {
}

interface Repository {
    suspend fun fetch(): Data

    class Base(
        private val cloudDataSource: DataSource,//интерфейс
        private val casheDataSource: MutableDataSource,//интерфейс
    ) : Repository {

        //если написать вот так, то это нарушение SOLID
        //зависимость внутри создалась
        private val cloudDataSourceBad = object: DataSource{
            override suspend fun fetch(): String {
                TODO("Not yet implemented")
            }
        }

        override suspend fun fetch(): Data {
            return if (casheDataSource.contains())
                Data(casheDataSource.fetch())
            else
                Data(cloudDataSource.fetch())
        }
    }
}


interface DataSource {
    suspend fun fetch(): String
}

interface MutableDataSource : DataSource {
    suspend fun contains(): Boolean
}

class Data(private val value: String)
