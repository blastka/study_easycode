package com.example.myapplication2.Java.Lesson18;

public class Lesson18 {
    public static final People[] PEOPLE = new People[]{new People(), new People(), new People(), new People()};
    public static final String[] COMMAND = new String[]{"a","b", "c"};
    public static final String[] RESULT = new String[]{"", "start"};

    public static void main(String[] args) {
        PEOPLE[0].firstName = "a";
        PEOPLE[0].lastName = "a";
        PEOPLE[1].firstName = "a";
        PEOPLE[1].lastName = "a";
    }
}
