package com.collections.arrays;

import java.security.SecureRandom;
import java.util.Scanner;

public class Divination {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        int[] figure = {1, 2, 3, 4};
        System.out.println("Hello. Remember, that you should choose only 1,2,3,4 numbers. How many times you want play?");
        Scanner scanner = new Scanner(System.in);
        int playTimes = scanner.nextInt();

        int Bad = 0;
        int Good = 0;
        for (int i = 0; i < playTimes; i++) {
            int result = 1 + random.nextInt(4);
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Input number");
            int inputNumber = scanner2.nextInt();
            if (inputNumber != 1 && inputNumber != 2 && inputNumber != 3 && inputNumber != 4){
                System.out.println("You should input number 1 or 2, or 3, or 4");
                i--;
            } else {
                if (result == inputNumber) {
                    System.out.println("Good! Result is " + result);
                    Good++;
                } else {
                    System.out.println("Bad. Result is " + result);
                    Bad++;
                }
            }
        }
        System.out.println("Game over!");
        System.out.println("Play Times = " + playTimes);
        System.out.println("Good = " + Good);
        System.out.println("Bad = " + Bad);
        try {
            double resultOfGame = Double.valueOf(Good)/Double.valueOf(playTimes)*100.00;
            System.out.println("Result of Game = " + resultOfGame + "%");
        } catch (ArithmeticException e){
            System.out.println("Divide on 0");;
        }

    }
}
