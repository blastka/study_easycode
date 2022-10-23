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
        new Download("one").start();
        new Download("two").start();

        factorial(10);
    }

    public static int factorial(int argument){
        if (argument == 1)
            return 1;
        System.out.println(argument);
        return argument * factorial(argument - 1);
    }


}
