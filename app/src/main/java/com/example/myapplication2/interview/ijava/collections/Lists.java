package com.example.myapplication2.interview.ijava.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * В отличие от коллекций у массивов фиксированный размер. И они заполняются нулами.
 *
 * List - список из однотипных элементов, которые могут дублироваться, является интерфейсом, наследуется
 * от коллекции. Можно использовать null.
 *
 * ArrayList - дорогая вставка в середину, в начала, дешевый поиск по элементам.
 * Его размер увеличивается по мере добавления элементов.
 * LinkedList - дорогой поиск по элементам, дешевая вставка
 *
 * Set - не допускает наличие дублей.
 *
 * HashSet - не допускает наличие дублей. Порядок произвольный. Распределяется в зависимости от
 * расчета ключа.
 *
 * LinkedHashSet - не допускает наличие дублей. Порядок есть.
 *
 * TreeSet - не допускает наличие дублей, сортирует список.
 *
 * Map - пара ключ значение.
 *
 * HashMap - Порядок случайный. При одинаковых элементах происходит перезапись.
 *
 * LinkedHashMap - Порядок есть.
 */

public class Lists {
    public static void main(String[] args) {
    }

    public static void funArrayList(){
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add(1,"pineapple");
    }

    public static void funLinkedList(){
        List<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("cherry");
    }


    public static void funHashSet(){
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("watermelon");
        fruits.add("pineapple");
        fruits.add("lemon");
        System.out.println(fruits);
    }

    public static void funLinkedHashSet(){
        Set<String> fruits = new LinkedHashSet<>();
        fruits.add("lemon");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("watermelon");
        System.out.println(fruits);
    }

    public static void funTreeSet(){
        Set<String> fruits = new TreeSet<>();
        fruits.add("lemon");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("watermelon");
        System.out.println(fruits);
    }

    public static void funHashMap(){
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("lemon", 5);
        fruits.put("apple", 5);
        fruits.put("apple", 1);
        fruits.put("cherry", 6);
        fruits.put("strawberry", 10);
        fruits.put("watermelon", 10);
        System.out.println(fruits);

    }

    public static void funLinkedHashMap(){
        Map<String, Integer> fruits = new LinkedHashMap<>();
        fruits.put("lemon", 5);
        fruits.put("apple", 5);
        fruits.put("apple", 1);
        fruits.put("cherry", 6);
        fruits.put("strawberry", 10);
        fruits.put("watermelon", 10);
        System.out.println(fruits);

    }

    public static void funTreeMap(){
        Map<String, Integer> fruits = new TreeMap<>();
        fruits.put("lemon", 5);
        fruits.put("apple", 5);
        fruits.put("apple", 1);
        fruits.put("cherry", 6);
        fruits.put("strawberry", 10);
        fruits.put("watermelon", 10);
        System.out.println(fruits);

    }




}
