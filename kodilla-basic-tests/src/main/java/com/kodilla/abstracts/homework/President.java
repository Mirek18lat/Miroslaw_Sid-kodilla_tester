package com.kodilla.abstracts.homework;

public class President extends Job {

    @Override
    public String getResponsibilities() {
        System.out.println("Big boss works!");
        return getResponsibilities();
    }
}
