package com.yollacademy.lessons.replit;

public class Replit116 {
    public static void main(String[] args) {
        int year = 0;
        int size = 0;
        int growth = 0;

        for (year = 0; year <= 10; year++) {
            if (year < 3) {
                growth = 1;
                size += growth;
                System.out.println("Year" + year + " - growth " + growth + " sm");
                System.out.println("Tree size: " + size + " sm");
            }else {
                growth = 2;
                size += growth;
                System.out.println("Year" + year + " - growth " + growth + " sm");
                System.out.println("Tree size: " + size + " sm");
            }
        }
    }
}

//    The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year, this is a simple implementation of the algorithm.
//    You will need to use loops to create it.
//        Show 10 years of growth of the Utopian Tree.
//        Hint: you might want to create 3 variables and use if else inside of this while loop :)
//        Output:
//        year 1 - growth 1 cm
//        tree size: 1cm
//        year 2 - growth 1 cm
//        tree size: 2cm
//        year 3  - growth 1 cm
//        tree size:3cm
//        year 4 - growth 2 cm
//        tree size: 5cm
//        year 5 - growth 2 cm
//        tree size: 7cm
//        year 6 - growth 2 cm
//        tree size: 9cm
//        ... until you reach year 10
