package com.yollacademy.lessons.replit;

import java.util.Scanner;

public class Replit167 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string:");
        String word = input.next();
        System.out.println(uniqueChars(word));
    }
    public static String uniqueChars(String w1) {
        String result = "";
        for(int i = 0; i < w1.length(); i++) {
            if(result.indexOf(w1.charAt(i)) == -1) {
                result += w1.charAt(i);
            }
        }
        return result;
    }
}
