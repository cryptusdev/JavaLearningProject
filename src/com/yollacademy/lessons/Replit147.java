package com.yollacademy.lessons;

import java.util.Scanner;

public class Replit147 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] nums = new int[size];
        isPos(nums);

    }

    public static void isPos(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] <= 0) {
                System.out.println("not positive");
            }else{
                System.out.println("positive");
            }
        }

    }
}
