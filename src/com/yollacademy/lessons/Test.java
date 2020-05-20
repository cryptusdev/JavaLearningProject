package com.yollacademy.lessons;

public class Test {
    public static String mixString(String s1, String s2) {
        String [] aS1 = s1.split("", 0);
        String [] aS2 = s2.split("", 0);

        String result = "";

        for (int i = 0; i < aS1.length; i++) {
            result += aS1[i] + aS2[i];
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(mixString("12345","abcde"));
        System.out.println(mixString("howdy","hello"));
    }
}
