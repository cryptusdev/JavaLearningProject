package com.yollacademy.lessons.replit;

import java.util.ArrayList;

public class Replit187 {
    public static void main(String[] args) {
        ArrayList<String> wordList1= new ArrayList<>();
        wordList1.add("JAVA");
        wordList1.add("SQL");
        wordList1.add("Python");

        System.out.println(wordList1);

        ArrayList<String> wordList2= new ArrayList<>();
        wordList2.add("Selenium");
        wordList2.add("Junit");
        wordList2.add("TestNG");

        System.out.println(wordList2);
        System.out.println(combineAL(wordList1,wordList2));
    }

    public static ArrayList combineAL(ArrayList<String> aL1, ArrayList<String> aL2) {
        //ArrayList<String> combinedList = new ArrayList<>();
        aL1.addAll(aL2);
        return aL1;
    }

}

