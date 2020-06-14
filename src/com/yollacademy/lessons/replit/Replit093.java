package com.yollacademy.lessons.replit;

import java.util.Scanner;

public class Replit093 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int num = scan.nextInt();
        String prefix = str.substring(0, num);
        int count = 0;

        while (str.contains(prefix)) {
            str = str.replaceFirst(prefix, "");
            count++;
        }
        if (count == 1) {
            System.out.println(false);
            System.out.println(prefix + " appears once only");
        }
        else if (count == 2) {
            System.out.println(true);
            System.out.println(prefix + " appears twice");
        }


    }
}
