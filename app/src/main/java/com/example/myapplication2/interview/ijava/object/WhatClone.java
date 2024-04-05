package com.example.myapplication2.interview.ijava.object;


/**
 * метод clone нельзя вызвать снаружи
 * Если так без implements Cloneable в Person вызвать будет ошибка CloneNotSupportedException
 */
public class WhatClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person(15, "Aris");
        //person.clone();
        Person newPerson = person.clonePerson();
        System.out.println(newPerson.toString());
        newPerson.check();
        Object newPerson2 = person.clonePerson();
        System.out.println(newPerson2.toString());
        //newPerson2.check(); // так как получили Object то нет доступа к методам класса Person
        System.out.println(newPerson == person);//по ссылкам
        System.out.println(newPerson.equals(person));//по содержимому
    }
}
