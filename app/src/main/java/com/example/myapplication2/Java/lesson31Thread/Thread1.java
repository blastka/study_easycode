package com.example.myapplication2.Java.lesson31Thread;

import java.util.Date;

public class Thread1 {
    public static void main(String[] args) {
        Thread download = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread " + new Date());

            }
        });
        System.out.println("before start " + new Date());
        download.start();
        System.out.println("finish " + new Date());
    }
}
