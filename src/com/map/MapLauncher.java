package com.map;

import com.set.Car;

import java.util.HashMap;
import java.util.Map;

public class MapLauncher {
    public static void main(String[] args) {
        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("Toyota", 50);
        numbers.put("Audi", 50);
        System.out.println(numbers.get("Fifty"));
    }
}
