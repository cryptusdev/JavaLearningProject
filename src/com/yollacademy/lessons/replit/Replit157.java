package com.yollacademy.lessons.replit;

import java.util.Scanner;

public class Replit157 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        System.out.println(max(num1, num2));
    }

    public static int max(int x,int  max) {
        if (x > max) {
            return x;
        }else{
            return max;
        }
    }

}
