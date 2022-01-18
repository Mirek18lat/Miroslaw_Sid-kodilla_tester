package com.kodilla.collections.interfaces.homework;

public class Renault implements Car{
    private int speed;

    public Renault(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + 7;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = this.speed - 7;
    }
}
