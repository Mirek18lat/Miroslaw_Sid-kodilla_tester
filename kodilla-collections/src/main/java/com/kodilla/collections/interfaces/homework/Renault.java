package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Triangle;

import java.util.Objects;

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

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Renault renault = (Renault) o;
        return Double.compare(renault.speed, speed) == 0;
    }

    @Override public int hashCode() {
        return Objects.hash(speed);
    }
}