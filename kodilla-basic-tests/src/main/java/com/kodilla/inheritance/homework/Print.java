package com.kodilla.inheritance.homework;

public class Print {
    public static void main(String[] args) {
        OperatingSystem windows = new OperatingSystem(1985, 2021);
        windows.turnOn();

        Windows windowsXP = new Windows(2001, 2019);
        windowsXP.turnOn();

        Apple appleLeopard = new Apple(2006, 2009);
        appleLeopard.turnOn();
    }
}
