package com.yollacademy.lessons.replit;

import java.util.Scanner;

public class Replit163 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Boolean Value notEmpty:");
        boolean x = input.nextBoolean();
        System.out.println("Enter task ID:");
        int tId = input.nextInt();
        System.out.println("Enter current ID:");
        int curId = input.nextInt();

        System.out.println(validateTask(x, tId, curId));
    }

    public static boolean validateTask(boolean notEmpty,int taskId,int currentId)  {
        if (notEmpty && taskId - currentId == 1) {
            return true;
        }else{
            return false;
        }
    }
}
