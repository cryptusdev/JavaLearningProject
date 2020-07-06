package com.yollacademy.lessons.class_objects;

public class Car {
    String make;
    String color;
    int buildYear;
    boolean isElectric;

    void allInfo() {
        System.out.println("Car make: " + make +
                "\nColor: " + color +
                "\nBuild Year: " + buildYear +
                "\n Is this car electric? " + isElectric);
    }
    void startEngine() {
        System.out.println("Engine is started!");
    }

}
