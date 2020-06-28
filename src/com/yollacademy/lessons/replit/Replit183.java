package com.yollacademy.lessons.replit;

import java.util.ArrayList;

public class Replit183 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(11);
        ints.add(12);
        ints.add(13);
        ints.add(14);
        ints.add(15);
        System.out.println(sum(ints));
    }
    public static int sum(ArrayList<Integer> ints)	{
        int result = 0;
        for (int i = 0; i < ints.size(); i++) {
            result += ints.get(i);
        }
        return result;
    }
}

//    On the left, given an ArrayList of Integers called ints, create and return the sum of all the Integers in ints.
//
//        Note: First add values (11, 12, 13, 14, 15) into ints ArrayList. in main method.
//
//        At the end pass ints arraylist to sum() method and print its output in console