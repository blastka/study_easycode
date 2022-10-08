package com.example.myapplication2.Java;

public class Constructor {
    public static void main(String[] args) {
        CommandAndResult a = new CommandAndResult("a", "b");
        CommandAndResult b = new CommandAndResult("a", "b");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

}