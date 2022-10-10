package com.example.myapplication2.lesson25Example;

public class Solution {
    public static void main(String[] args) {
        Screen1Fragment screen1Fragment = new Screen1Fragment(new Screen1Presenter());
        screen1Fragment.onResume(new Screen1View());
    }
}
