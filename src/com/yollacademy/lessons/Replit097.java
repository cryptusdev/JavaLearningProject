package com.yollacademy.lessons;

import java.util.Scanner;

public class Replit097 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int jCount = 0;
        int pCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.contains("java")) {
                str = str.replaceFirst("java", "");
                jCount++;
            }
            else if (str.contains("python")) {
                str = str.replaceFirst("python", "");
                pCount++;
            }
        }
        if (jCount == pCount) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
