package com.example.myapplication2.Java.lesson27;

import com.example.myapplication2.Java.lesson26.DataCallback;
import com.example.myapplication2.Java.lesson26.DataContainer;
import com.example.myapplication2.Java.lesson26.ErrorInfo;
import com.example.myapplication2.Java.lesson26.Log;

public class Solution {
    public static void main(String[] args) {
        Executor executor = new Executor();
        executor.addCallback(new DataCallback.Base(new Log.Local()));
        executor.execute();
        executor.removeCallback(null);//когда колбэк не нужен, его занулять
    }
}
