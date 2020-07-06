package com.yollacademy.lessons.replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit198 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values for 1st array: ");
        int [] arr1 = new int[5];
        int [] arr2 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter values for 2nd array: ");
        for (int i = 0; i < 5; i++) {
            arr2[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(addElements(arr1, arr2)));
    }
    public static int[] addElements(int[] ints1, int[] ints2) {
        int[] finalArr = new int[5];
        for (int i = 0; i < ints1.length; i++) {
            finalArr[i] = ints1[i] + ints2[i];
        }
        return finalArr;
    }
}
