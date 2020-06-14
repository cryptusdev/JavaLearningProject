package com.yollacademy.lessons.replit;

public class Replit143 {
    public static void main(String[] args) {
        printHollowRect();
    }

    public static void printHollowRect() {
//        System.out.println("*****");
//        for(int i = 0; i < 3; i++) {
//            System.out.println("*   *");
//        }
//        System.out.println("*****");
        for (int i = 0; i < 5; i++){
            if(i == 0 || i == 4) {
                System.out.println("*****");
            }
            else {
                System.out.println("*   *");
            }
        }

    }
}
