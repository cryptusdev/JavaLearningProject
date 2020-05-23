package com.yollacademy.lessons;

import java.util.Scanner;

public class Replit156 {
    public static void wordCount(String[] arr, String word) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].contains(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.next();
        String checkWord = input.next();
        String[] arrWords = x.split(",", 0);
        wordCount(arrWords, checkWord);
    }
}
