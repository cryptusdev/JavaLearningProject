package com.yollacademy.lessons;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Replit102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] newArr = sentence.split(" ");
        Collections.reverse(Arrays.asList(newArr));

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
