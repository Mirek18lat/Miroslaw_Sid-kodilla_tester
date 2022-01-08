package com.kodilla.inheritance.homework;

public class Apple extends OperatingSystem {

    @Override
    public void turnOn() {System.out.println("MacOS was issued in: " + issueDate);
    }

    public Apple(int issueDate, int offDate) {
        super(issueDate, offDate);
    }
}
