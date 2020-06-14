package com.yollacademy.lessons.replit;

import java.util.Scanner;

public class Replit162 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Boolean Value a:");
        boolean a = input.nextBoolean();
        System.out.println("Enter Boolean Value b:");
        boolean b = input.nextBoolean();
        System.out.println("Enter Boolean Value c");
        boolean c = input.nextBoolean();

        System.out.println(threeLocks(a, b, c));

    }
    public static boolean threeLocks(boolean one, boolean two, boolean three) {
        if ((one == true && two == true) || three == true) {
            return true;
        }else{
            return false;
        }
    }
}
