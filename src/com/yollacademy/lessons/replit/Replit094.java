package com.yollacademy.lessons.replit;

import java.util.Scanner;

public class Replit094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();

        if (html.contains("<html>") != true) {
            System.out.println("Invalid input!");
        }else{
            System.out.println(html.substring(html.indexOf("\"")+1, html.lastIndexOf("\"")));
        }


    }
}
