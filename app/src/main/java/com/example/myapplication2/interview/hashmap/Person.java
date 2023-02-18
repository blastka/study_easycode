package com.example.myapplication2.interview.hashmap;

import java.util.Objects;

public class Person {
    private final int age;
    private final String name;


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals " + name);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    /**
     * Если hashCode сделать всегда одинаковыми, будет сравнение далее по equals, по содержимому при переопределенном
     *
     */
    @Override
    public int hashCode() {
        System.out.println("hashcodename " + name + " " + Objects.hash(age, name));
        return Objects.hash(age, name);
    }
}
