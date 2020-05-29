package com.yollacademy.lessons;

import java.util.Scanner;

public class Replit161 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Water Units:");
        double amount = input.nextDouble();
        System.out.println(waterTax(amount));

    }

    public static double waterTax(double units) {
        if (units > 50) {
            if (units > 150) {
                units = (units * 0.9) + 100;
            }
            else if (units > 100) {
                units = (units * 0.9) + 50;
            }else{
                units *= 0.9;
            }
        }else{
            units *= 0.6;
        }
        return units;
    }
}
