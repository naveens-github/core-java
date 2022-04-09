package com.collections;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {

    @Test
    public void create() {
        Map<String, Integer> map1 = new LinkedHashMap<>();
        System.out.println(map1);
    }

    @Test
    public void put() {
        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("One", 1);
        map1.put("Two", 2);
        map1.put("Three", 3);
        map1.put("four", 4);
        map1.put("five", 5);
        System.out.println(map1);
    }

    @Test
    public void get() {
        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("Naveen", "Reddy");
        map1.put("Revanth", "Anumula");
        map1.put("Anil", "Chintha");
        System.out.println(map1);

        String value1 = map1.get("Revanth");
        System.out.println(value1);

        String value2 = map1.get("anil");
        System.out.println(value2);
    }

    @Test
    public void iterate() {
        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1, "Naveen");
        map1.put(9, "Revanth");
        map1.put(15, "Mahomes");
        System.out.println(map1);

        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue());
        }

        // using jdk8 stream
        map1.forEach((key, value) -> System.out.println("key=" + key + ", value=" + value));
    }

}
