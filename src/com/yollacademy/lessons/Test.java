package com.yollacademy.lessons;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] x = new int [] {2, 9, 4, 6, 8, 10, 3, 5, 7, 9};
        boolean isUnique=true;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i != j) {
                    if (x[i] == x[j]) {
                        isUnique=false;
                    }
                }
            }
        }
        System.out.println(isUnique);

    }
}

