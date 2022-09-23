package com.collections.arrays;

import java.security.SecureRandom;

public class Dies {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];
        for (int i = 0; i < 1000; i++) {
            ++frequency[1+random.nextInt(6)];
        }

//        for (int i = 1; i < frequency.length; i++) {
//            System.out.println("Side " + i + ":" + frequency[i]);
//        }

        multiDimArrayLauncher();
    }

    private static void multiDimArrayLauncher(){
        int[][]a = {{1,2},{3,4},{5,6,7,8}};
        int[][]b = new int[3][3];
        //Объявление массива, где 3 строки из 3 элементов
        int[][]c = new int[2][];
        c[0] = new int[3];
        c[1] = new int[4];
        c[0][0] = 1;
        c[0][1] = 2;
        c[0][2] = 3;
        c[1][0] = 4;
        c[1][1] = 5;
        c[1][2] = 6;
        c[1][3] = 7;

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.println(c[i][j]);
            }
        }
    }
}
