package com.yollacademy.lessons.replit;

import java.util.Arrays;

public class Replit176 {
    public static void main(String[] args) {
        int arr[]={12,2,3,24,5};
        double arr1[]={22.4, 11.3,34.4,16.9};

        System.out.println(findMax(arr));
        System.out.println(findMax(arr1));

    }
    public static int findMax(int [] x) {
        int max = 0;
        for(int i = 0; i < x.length; i++) {
            if(x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }

    public static double findMax(double [] y) {
        double max = 0;
        for(int i = 0; i < y.length; i++) {
            if(y[i] > max) {
                max = y[i];
            }
        }
        return max;
    }

}
