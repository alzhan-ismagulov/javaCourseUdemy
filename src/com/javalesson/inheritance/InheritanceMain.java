package com.javalesson.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {

        Bus auto = new Bus("Mersedes", "A180", EngineType.DIESEL);
        System.out.println(auto.getProducer());
        System.out.println(auto.getModel());
    }
}
