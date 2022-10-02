package com.collections.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int a = (int)(Math.random()*10);
            arrayList1.add(a);
        }
        System.out.println(arrayList1);
        for (int digit : arrayList1) {
            System.out.println(digit);
        }
        Collections.sort(arrayList1);
        System.out.println("Отсортированный лист - " + arrayList1);
        arrayList1.remove(1);
        System.out.println("Удалили элемент с индексом 1 - " + arrayList1);
        arrayList1.set(2, 0);
        System.out.println("Заменили элемент с индексом 2 на 0 - " + arrayList1);
        arrayList1.add(3, 9);
        System.out.println("Добавили 9 как элемент с индексом 3 " + arrayList1);
    }
}
