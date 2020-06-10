package com.yollacademy.lessons;

import java.util.Scanner;

public class CalcTestDrive {
    public static void main(String[] args) {
        Calc a = new Calc();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 values:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        a.setX(num1);
        a.setY(num2);
        a.plus();
        System.out.println(num1 + " + " + num2 + " = " + a.getResult());
        a.minus();
        System.out.println(num1 + " - " + num2 + " = " + a.getResult());



    }
}
