package com.yollacademy.lessons.replit;

import java.util.Scanner;

public class Replit106 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] newArr = sentence.split(" ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }

}
