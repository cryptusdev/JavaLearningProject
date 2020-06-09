package com.yollacademy.lessons;

import java.util.Scanner;

public class Replit166 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string1: ");
        String word1 = input.next();
        System.out.println("Enter string2:");
        String word2 = input.next();
        System.out.println(mergeStrings(word1, word2));
    }
    public static String mergeStrings(String s1, String s2) {
        String result = "";
        for(int i = 0; i < s1.length() || i < s2.length(); i++){
            if(i < s1.length()) {
                result += s1.charAt(i);
            }
            if(i < s2.length()) {
                result += s2.charAt(i);
            }
        }
        return result;

    }
}
