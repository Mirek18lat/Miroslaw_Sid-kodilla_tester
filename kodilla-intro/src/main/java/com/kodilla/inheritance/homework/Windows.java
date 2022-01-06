package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    @Override
    public void turnOn() {
        System.out.println("WindowsXP was issued in: " + issueDate);
    }
    public Windows(int issueDate, int offDate) {
        super(issueDate, offDate);
    }
}
