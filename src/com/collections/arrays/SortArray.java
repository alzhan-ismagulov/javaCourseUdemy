package com.collections.arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] myArray = {4,26,3,10};
        System.out.println("First array");
        for (int j = 0; j < myArray.length; j++) {
            System.out.println(myArray[j]);
        }
        System.out.println("Lets sort");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < myArray.length; k++) {
            System.out.println(myArray[k]);
        }
    }
}
