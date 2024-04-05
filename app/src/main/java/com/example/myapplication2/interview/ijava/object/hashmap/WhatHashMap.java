package com.example.myapplication2.interview.ijava.object.hashmap;

import com.example.myapplication2.interview.ijava.object.Person;

import java.util.HashMap;

/**
 * Если не переопределить equals и hashcode то выведется null
 * так как кладутся объекты, то при get идет поиск по ссылкам, а не по содержимому
 * Для поиска обязательно нужнв equals и hashcode
 *
 * Если не переопределить equals то будет сравнение по ссылкам и добавится в hashmap все равно.
 *
 * Если переопределить что-то одно будет выводиться null при get.
 *
 * Всегда вычисляется сначала hashcode. При коллизиях - совпадение hashcode,  применяется equals по содержимому.
 * Если по содержимому тоже true, то новое значение не кладется.
 */
public class WhatHashMap {

    public static void main(String[] args) {
        HashMap<Person, Integer> map = new HashMap<>();
        for (int i = 0; i < 2; i++){
            map.put(new Person(i, "name" + i), i);
        }
        System.out.println("break " + map);

        for (int i = 0; i < 2; i++){
            Object value = map.get(new Person(i, "name" + i));
            System.out.println(value);
        }
    }
}
