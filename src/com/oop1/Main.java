package com.oop1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dog's count " + Dog.getDogsCount());

        Dog lab = new Dog();
        lab.setName("Charlie");
        lab.setBreed("Lab");
        lab.setSize(Size.AVERAGE);
        lab.bite();

        Dog sheppard = new Dog();
        lab.setName("Mike");
        lab.setBreed("sheppard");
        lab.setSize(Size.BIG);
        lab.bite();

        Dog doberman = new Dog();
        lab.setName("Jack");
        lab.setBreed("doberman");
        lab.setSize(Size.BIG);
        lab.bite();

        Size s = Size.SMALL;
        Size s1 = Size.valueOf("BIG");

        Size[] values = Size.values();
        for (int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }
    }
}
