package com.yollacademy.lessons.replit;
import java.util.Arrays;
import java.util.Scanner;

public class Replit149 {
    public static void add_to_r(int[] r,int n) {
        int[] rNew = new int[r.length + 1];
        rNew = Arrays.copyOf(r, rNew.length);
        rNew[rNew.length - 1] = n;
        System.out.println(Arrays.toString(rNew));

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x = new int[2];
        x[0] = input.nextInt();
        x[1] = input.nextInt();
        //x[2] = input.nextInt();
        int num = input.nextInt();
        add_to_r(x  ,num);
    }

}