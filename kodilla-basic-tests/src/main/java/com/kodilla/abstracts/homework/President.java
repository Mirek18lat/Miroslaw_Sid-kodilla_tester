package com.kodilla.abstracts.homework;

public class President extends Job {

    @Override
    public boolean getResponsibilities() {
        System.out.println("Big boss works!");
        return false;
    }
}
