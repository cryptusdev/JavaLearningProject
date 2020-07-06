package com.yollacademy.lessons.class_objects;

public class CarRun {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.make = "RAV4";
        toyota.color = "Black";
        toyota.buildYear = 2015;
        toyota.isElectric = false;

        toyota.allInfo();
        toyota.startEngine();

    }
}
