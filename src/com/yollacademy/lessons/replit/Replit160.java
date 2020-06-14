package com.yollacademy.lessons.replit;

import java.util.Scanner;

public class Replit160 {
    // your main method code here
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter bool 1");
        boolean x = input.nextBoolean();
        System.out.println("Enter bool 2");
        boolean y = input.nextBoolean();
        System.out.println(hamletQuote(x, y));
    }

    public static boolean hamletQuote(boolean first, boolean second)  {
        if (first == false && second == false) {
            return false;
        }else{
            return true;
        }
    }// hamletQuote method ends here
}
