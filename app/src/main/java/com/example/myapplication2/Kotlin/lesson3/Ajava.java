package com.example.myapplication2.Kotlin.lesson3;

import java.util.Objects;

public class Ajava {
    private final String a;
    private final int b;
    private final Callback callback;

    public Ajava(String a, int b, Callback callback) {
        this.a = a;
        this.b = b;
        this.callback = callback;
    }

    @Override
    public String toString() {
        return "Ajava{" +
                "a='" + a + '\'' +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        callback.equalsCalled();
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ajava ajava = (Ajava) o;
        return b == ajava.b && Objects.equals(a, ajava.a);
    }

    @Override
    public int hashCode() {
        callback.hashCodeCalled();
        return Objects.hash(a, b);
    }


}
