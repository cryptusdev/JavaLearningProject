package com.yollacademy.lessons.replit;

import java.util.Scanner;

public class DbTestDrive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Db db = new Db();
        System.out.println("Insert Data:");
        String w1 = input.next();
        int i1 = input.nextInt();

        db.insertData(w1, i1);

        System.out.println(db.getData());
        System.out.println(db.getYint());

        System.out.println("Set Data:");

        db.setData(w1);
        db.setYint(i1);

        System.out.println(db.getYint());
        System.out.println(db.getData());
    }





}
