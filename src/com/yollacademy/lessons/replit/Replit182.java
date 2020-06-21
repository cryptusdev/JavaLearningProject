package com.yollacademy.lessons.replit;

import java.util.ArrayList;

public class Replit182 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("soccer");
        words.add("baseball");
        words.add("football");
        words.add("hockey");
        words.add("basketball");

        test(words);
    }
    public static void test(ArrayList<String> words)	{
        words.set(0, "git");
        words.set(2, "gud");
        System.out.println(words);
    }
}
//
//    In main method create a words arrayList and add the following string values into it.
//        Values:  soccer, baseball, football, hockey, basketball
//
//        At the end, call test method inside the main method then
//        print words arraylist in console
//
//        test() method will take an argument of String ArrayLists called words, and then set the 0th and 2nd indexes to be "git" and "gud" respectively.
