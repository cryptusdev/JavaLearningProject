package com.yollacademy.lessons;

import java.util.Scanner;

public class Replit091 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;

        while (str.contains("hi")) {
            str = str.replaceFirst("hi", "");
            count++;
        }
        System.out.println(count);
    }
}
