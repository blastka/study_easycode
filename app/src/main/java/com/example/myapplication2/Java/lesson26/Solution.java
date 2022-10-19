package com.example.myapplication2.Java.lesson26;

/**
 * В данный момент приведен код не ООП, нужно переделать
 */
public class Solution {
    public static void main(String[] args) {
        Executor executor = new Executor();
        Object dataContainer = executor.execute();
        if (dataContainer instanceof DataContainer){
            ((DataContainer) dataContainer).show();
        } else
            ((ErrorInfo) dataContainer).log(new Log.Local());
    }
}
