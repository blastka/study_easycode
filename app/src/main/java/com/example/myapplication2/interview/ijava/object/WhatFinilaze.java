package com.example.myapplication2.interview.ijava.object;

/**
 * блок finally вызовется вне зависимости от результата
 */
public class WhatFinilaze {
    public static void main(String[] args) {
        try {
            for (int i = 0; i<70000; i++)
            new Person(8, "Alisa" + i);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

    }
}
