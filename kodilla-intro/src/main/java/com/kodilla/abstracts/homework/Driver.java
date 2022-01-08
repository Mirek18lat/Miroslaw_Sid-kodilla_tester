package com.kodilla.abstracts.homework;

public class Driver extends Job {

    @Override
    public boolean getResponsibilities() {
        System.out.println("Drive a car");
        return false;
    }
}
