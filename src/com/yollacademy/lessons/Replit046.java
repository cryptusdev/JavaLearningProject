package com.yollacademy.lessons;

public class Replit046 {
    public static void main(String[] args) {

    }

    public static double negate(double num) {
        if (num < 0) {
            num = Math.abs(num);
        }else{
            num = -(num);
        }
        return num;
    }
}
