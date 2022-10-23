package com.example.myapplication2.Java.lesson31;

import java.io.PrintStream;

public interface ProgressCallback {

    void updatePercent(int count);

    class Base implements ProgressCallback{

        private int total = 0;

        /**
         * В этом случае может быть гонка потоков, когда один потом не дожидаясь
         * второго вошел в функцию и делает там "все что хочет"
         * @param count
         */
        @Override
        public void updatePercent(int count) {
            System.out.println("-----");
            System.out.println("1");
            total+= count;
        }

        public void showTotal(PrintStream stream){
            stream.println(total);
        }
    }
}
