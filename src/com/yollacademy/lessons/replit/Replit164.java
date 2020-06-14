package com.yollacademy.lessons.replit;

import java.util.Scanner;

public class Replit164 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Boolean Value isAvailable:");
        boolean isAvailable = input.nextBoolean();
        System.out.println("Enter month:");
        int month = input.nextInt();
        System.out.println("Enter day:");
        int day = input.nextInt();
        System.out.println("Enter year:");
        int year = input.nextInt();

        System.out.println(simpleRoomBook(isAvailable, month, day, year));
    }
    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
        if (isAvailable == false || year != 2018) {
            return false;
        }
        else if (day >= 1 && day <= 8 && month == 7) {
            return false;
        }else{
            return true;
        }
    }
}
