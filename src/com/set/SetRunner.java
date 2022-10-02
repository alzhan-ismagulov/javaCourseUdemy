package com.set;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        String[] cars = {"Mersedes", "Mini", "Audi", "VW", "Smart", "Toyota"};
        String[] otherCars = { "Audi", "Ford", "GMS", "Toyota", "Chevrolet"};

        Set<String> carSet = new TreeSet<>(Arrays.asList(cars));
        Set<String> otherCarSet = new TreeSet<>(Arrays.asList(otherCars));
        Set<String> uniqueCars = new TreeSet<>(carSet);
        uniqueCars.addAll(otherCarSet);

        print(uniqueCars);
    }

    private static void print(Set<String> cars){
        System.out.println(cars);
    }
}
