package com.yollacademy.lessons.replit;

import java.util.Scanner;

public class Replit159 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the buy price: ");
        int bP = input.nextInt();
        System.out.println("Enter sell price: ");
        int sP = input.nextInt();
        System.out.println(c_profit(bP, sP));

    }

    public static String c_profit(int buyPrice, int sellPrice) {
        if (sellPrice > buyPrice) {
            return "profit";
        }
        else if (sellPrice < buyPrice) {
            return "loss";
        }else{
            return "no loss";
        }
    }
}
