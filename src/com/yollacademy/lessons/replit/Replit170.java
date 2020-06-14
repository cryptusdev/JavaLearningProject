package com.yollacademy.lessons.replit;

import java.util.Scanner;

public class Replit170 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = input.next();
        System.out.println("Enter bad word:");
        String badWord = input.next();
        System.out.println(clean(word, badWord));
    }
    public static String clean(String word, String badWord) {
        return word.replace(badWord, "");
    }
}
