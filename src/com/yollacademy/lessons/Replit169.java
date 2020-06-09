package com.yollacademy.lessons;

import java.util.Scanner;

public class Replit169 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter words:");
        String sentence = input.nextLine();

        System.out.println(wordCount(sentence));

    }
    public static int wordCount(String word){
        String [] wordArray = word.split(" ");
        return wordArray.length;

    }
}
