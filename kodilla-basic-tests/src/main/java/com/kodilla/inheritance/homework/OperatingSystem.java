package com.kodilla.inheritance.homework;

public class OperatingSystem {
    int issueDate;
    int offDate;
    public  void turnOn() {
        System.out.println("This system was issued from " + issueDate);
    }
    public  void turnOff(int date) {
        System.out.println("This system was supported from " + offDate);

    }

    public OperatingSystem (int issueDate, int offDate) {
        this.issueDate = issueDate;
        this.offDate = offDate;
    }
}
