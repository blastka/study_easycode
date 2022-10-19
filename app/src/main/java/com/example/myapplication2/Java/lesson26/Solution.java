package com.example.myapplication2.Java.lesson26;


public class Solution {
    public static void main(String[] args) {
        Executor executor = new Executor();
        Object dataContainer = executor.execute();
        /**
         * Так был бы не ООП код, типа попытались решить проблему получения разных объектор
         */
        if (dataContainer instanceof DataContainer){
            ((DataContainer) dataContainer).show();
        } else
            ((ErrorInfo) dataContainer).log(new Log.Local());//тут порождаем объект, который внутри интерфейса
    }
}
