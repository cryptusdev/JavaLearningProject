package com.yollacademy.lessons;

import java.util.Scanner;

public class Replit104 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        String tempString = "";
        for (int i = 0; i < nums.length; i++) {
            tempString += nums[i];
        }
        System.out.println(tempString.contains("55"));



        //        boolean result = false;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 5 && nums[i-1] == 5) {
//                result = true;
//            }else{
//                result = false;
//            }
//        }
//        System.out.println(result);

    }
}
