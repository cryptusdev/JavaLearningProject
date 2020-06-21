package com.yollacademy.lessons.replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        String[] arr = email.split("@");
        if (arr.length == 2) {
            System.out.println("Email id: " + arr[0]);
            System.out.println("Email domain: " + arr[1]);
        }else{
            System.out.println("Invalid email!");
        }
    }

}
