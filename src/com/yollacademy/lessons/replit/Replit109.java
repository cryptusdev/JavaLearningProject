package com.yollacademy.lessons.replit;

public class Replit109 {
    public static void main(String[] args) {
        int k = 0;
        int total = 0;
        do {
            total += k * k;
            k++;
        }
        while(k <= 50);
        System.out.println(total);
    }
}
