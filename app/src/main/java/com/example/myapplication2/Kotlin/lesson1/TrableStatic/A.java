package com.example.myapplication2.Kotlin.lesson1.TrableStatic;

public class A {

    private final Log log;

    public A(){
        this(new Log.Default());
    }

    public A(Log log) {
        this.log = log;
    }


    int sum(int a, int b){
        log.log("summary");
        return a + b;
    }
}

interface Log {
    void log(Object object);

    class Default implements Log{

        @Override
        public void log(Object object) {
            System.out.println(object);
        }
    }
}
