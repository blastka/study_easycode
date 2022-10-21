package com.example.myapplication2.Java.lesson26.example1;

/**
 * В итоге получили такую логику - метод execute
 * в случае успеха возвращает объект DataContainer, а в случае ошибок
 * ErrorInfo.
 */
public class Solution {
    public static void main(String[] args) {
        Executor executor = new Executor();
        final Log log = new Log.Local();//Создали объект, его класс в интерфейсе Log
        DataCallback<DataContainer, ErrorInfo> callback = new DataCallback.Base(log);//создали объект, его класс в интерфейсе DataCallback
        executor.execute(callback);//запустили метод, в котором отрабатывают колбэки
    }
}
