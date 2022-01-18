package com.kodilla.collections.interfaces.homework;

public class Lada implements Car{
    private int speed;

    public Lada(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + 5;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = this.speed - 20;
    }
}
