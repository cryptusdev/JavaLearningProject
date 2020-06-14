package com.yollacademy.lessons.replit;

import java.util.Scanner;

public class Replit165 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Boolean Value available:");
        boolean available = input.nextBoolean();
        System.out.println("Enter Boolean Value gift:");
        boolean gift = input.nextBoolean();
        System.out.println("Enter ingredient1:");
        int ing1 = input.nextInt();
        System.out.println("Enter ingredient2:");
        int ing2 = input.nextInt();
        System.out.println("Enter ingredient3:");
        int ing3 = input.nextInt();

        System.out.println(getThunderBlazz(available, gift, ing1, ing2, ing3));
    }
    public static boolean getThunderBlazz(boolean available, boolean gift, int ing1, int ing2, int ing3) {
        if (available || gift) {
            return true;
        }
        else if ((ing1 == 1 || ing1 == 3) && (ing2 == 2 || ing2 == 1) && (ing3 == 3 || ing3 == 2)) {
            return true;
        }else{
            return false;
        }
    }
}
