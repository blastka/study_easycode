package com.example.myapplication2.Kotlin.lesson3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Ajava> map = new HashMap<>();
        map.put(1, new Ajava("1", 1));
        map.put(null, null);
        for (Map.Entry<Integer, Ajava> entrySet : map.entrySet()) {
            System.out.println(entrySet.getKey() + " " + entrySet.getValue());
        }

        HashMap<Ajava, Integer> mapi = new HashMap<>();
        Ajava hash1 = new Ajava("2", 2);
        mapi.put(hash1, 1);
        System.out.println(hash1.hashCode());
        Ajava hash2 = new Ajava("2", 2);
        mapi.put(hash2, 1);
        System.out.println(hash2.hashCode());

        System.out.println(mapi);
    }
}
