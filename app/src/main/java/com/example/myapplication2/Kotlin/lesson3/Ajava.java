package com.example.myapplication2.Kotlin.lesson3;

import java.util.Objects;

public class Ajava {
    private final String a;
    private final int b;

    public Ajava(String a, int b) {
        this.a = a;
        this.b = b;
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
        System.out.println("equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ajava ajava = (Ajava) o;
        return b == ajava.b && Objects.equals(a, ajava.a);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode");
        return Objects.hash(a, b);
    }
}
