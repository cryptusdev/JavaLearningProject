package com.yollacademy.lessons.replit;

import java.util.Scanner;

public class Replit141 {
    public static void main(String[] args) {
        cube();

    }
    public static void cube () {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println((int)Math.pow(n, 3));
    }
}
