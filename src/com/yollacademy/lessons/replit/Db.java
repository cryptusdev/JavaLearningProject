package com.yollacademy.lessons.replit;

public class Db {
    private static String data;
    private static int yint;

    public static void insertData(String eData, int eInt) {
        data = eData;
        yint = eInt;
    }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public int getYint() { return yint; }
    public void setYint(int yint) { this.yint = yint; }
}
