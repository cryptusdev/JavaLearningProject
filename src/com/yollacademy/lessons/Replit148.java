package com.yollacademy.lessons;

import java.util.Scanner;

public class Replit148 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = inp.nextInt();
        next3(num);
    }
    public static void next3(int x) {
        //System.out.println(x + 1 + " " + x + 2 + " " + x + 3);
        for (int i = 0; i < 3; i++) {
            x++;
            System.out.print(x + " ");
        }
    }
}
