package com.example.myapplication2.Java.lesson26;

/**
 * Сейчас мы создали анонимный класс для колбэка
 * В итоге получили такую логику - метод execute
 * в случае успеха возвращает объект DataContainer, а в случае ошибок
 * ErrorInfo.
 */
public class Solution {
    public static void main(String[] args) {
        Executor executor = new Executor();
        final Log log = new Log.Local();
        DataCallback callback = new DataCallback() {
            @Override
            public void returnSuccess(DataContainer dataContainer) {
                dataContainer.show();
            }

            @Override
            public void returnError(ErrorInfo errorInfo) {
                errorInfo.log(log);
            }
        };
        executor.execute(callback);
    }
}
