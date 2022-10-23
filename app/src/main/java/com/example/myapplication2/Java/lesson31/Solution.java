package com.example.myapplication2.Java.lesson31;

import com.example.myapplication2.Any.Data;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        new Thread(() -> load("one")).start();
        new Thread(() -> load("two")).start();
        factorial(10);
    }

    public static int factorial(int argument){
        if (argument == 1)
            return 1;
        System.out.println(argument);
        return argument * factorial(argument - 1);
    }

    public static void load(String name){
        System.out.println("starting at " + new Date());
        final String url = "https://mobimg.b-cdn.net/v3/fetch/b0/b029ca34284a080eb5c509994966d6f1.jpeg";

        try (BufferedInputStream inputStream = new BufferedInputStream(new URL(url).openStream())) {
            FileOutputStream fileOutputStream = new FileOutputStream(name + ".jpeg");
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer, 0, 1024)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finished at " + new Date());
        }
    }


}
