package com.yollacademy.lessons.replit;

import java.util.ArrayList;

public class Replit184 {
    public static void main(String[] args) {
        ArrayList<Double> dubs = new ArrayList<Double>();
        dubs.add(8.2);
        dubs.add(3.1);
        dubs.add(4.9);
        dubs.add(5.5);
        dubs.add(8.3);
        dubs.add(0.2);

        test(dubs);
    }
    public static void test(ArrayList<Double> dubs)	{
        for (int i = 0; i < 2; i++){
            dubs.remove(0);
        }
        System.out.println(dubs);

    }
}
