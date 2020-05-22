package com.yollacademy.lessons;

import java.util.Scanner;

public class Replit095 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int strL = str.length();
        String bre = "bread";
        int count = 0;


        String result = "";
        if (str.contains(bre) == false || str.lastIndexOf(bre)  == 0) {
            System.out.println("Nothing");
            System.exit(0);
        }
        result = str.substring(str.indexOf(bre)+5, str.lastIndexOf(bre));
        if (result.equals("")) {
            System.out.println("Nothing");
        }else{
            System.out.println(result);
        }

    }
}
