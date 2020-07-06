package com.yollacademy.lessons.replit;

import java.util.ArrayList;
import java.util.Collections;

public class Replit188 {
    public static void main(String[] args){
        ArrayList<String> wordList= new ArrayList<>();
        wordList.add("Java");
        wordList.add("SQL");
        wordList.add("Python");
        wordList.add("Selenium");
        wordList.add("SQL");
        wordList.add("Junit");
        wordList.add("TestNG");

        System.out.println(wordList);
        removeAll(wordList, "SQL");
        System.out.println(wordList);
    }

    public static void removeAll(ArrayList<String> aL, String word){
        for (int i = 0; i < aL.size(); i++) {
            if (aL.get(i) == word) {
                aL.remove(i);
            }
        }
    }
}
