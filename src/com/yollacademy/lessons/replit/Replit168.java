package com.yollacademy.lessons.replit;

import java.util.Scanner;

public class Replit168 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter main:");
        String main = input.next();
        System.out.println("Enter coverMe:");
        String cover = input.next();

        System.out.println(coverMe(main, cover));
    }
    public static String coverMe(String main, String cover) {
        String result = "";
        if (main.contains(cover)) {
            result = main.replace(cover, "[" + cover + "]");
        }else{
            result = "[" + main + "]";
        }
        return result;
    }

}
