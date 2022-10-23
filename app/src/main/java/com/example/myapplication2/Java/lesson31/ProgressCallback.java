package com.example.myapplication2.Java.lesson31;

import java.io.PrintStream;

import kotlin.jvm.Volatile;

public interface ProgressCallback {

    void updatePercent(int count);

    class Base implements ProgressCallback{

        private int total = 0;

        /**
         * В этом случае может быть гонка потоков, когда один потом не дожидаясь
         * второго вошел в функцию и делает там "все что хочет"
         * synchronized дает выполнять метод по очереди.
         * @param count
         */
        private static final Object object = new Object();

        @Override
        public void updatePercent(int count) {
            synchronized (object) {
                System.out.println("-----");
                System.out.println("1");
                total += count;
            }
        }

        public void showTotal(PrintStream stream){
            stream.println(total);
        }
    }
}
