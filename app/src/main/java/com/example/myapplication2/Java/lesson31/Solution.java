package com.example.myapplication2.Java.lesson31;

public class Solution {
    public static void main(String[] args) throws InterruptedException {

        ProgressCallback.Base callback = new ProgressCallback.Base();
        DownloadThread downloadThread = new DownloadThread(callback, "one");
        downloadThread.start();
        DownloadThread downloadThread2 = new DownloadThread(callback, "two");
        downloadThread2.start();
        downloadThread.join();
        downloadThread2.join();
        callback.showTotal(System.out);
        factorial(10);
    }

    public static int factorial(int argument){
        if (argument == 1)
            return 1;
        System.out.println(argument);
        return argument * factorial(argument - 1);
    }


}
