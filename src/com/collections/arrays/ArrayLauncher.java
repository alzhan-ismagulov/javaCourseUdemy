package com.collections.arrays;

import java.util.Scanner;

public class ArrayLauncher {
    //Инициализируем объект сканнер
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Создаём массив myArray состоящий из 8 элементов
        int[] myArray = new int[8];
        System.out.println("Please enter the 8 int elements");
        for (int j = 0; j<myArray.length; j++){
            System.out.println("Next element");
            //Записываем в массив myArray то, что набирали с клавиатуры
            myArray[j] = scanner.nextInt();
        }
        for (int i=0; i<myArray.length;i++){
            //Выводим на экран массив
            System.out.println("Element #" + i + " = " + myArray[i]);
        }
    }
}
