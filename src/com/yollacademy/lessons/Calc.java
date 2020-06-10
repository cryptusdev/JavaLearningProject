package com.yollacademy.lessons;

public class Calc {
    private static int x;
    private static int y;
    private static int result;

    public int getResult() { return result; }
    public void setY(int y) { this.y = y; }
    public void setX(int x) { this.x = x; }

    public static void plus() {
        result = x + y;
    }
    public static void minus() {
        result = x - y;
    }
}
