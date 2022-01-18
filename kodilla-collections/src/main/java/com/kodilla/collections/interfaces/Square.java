package com.kodilla.collections.interfaces;

public class Square implements Shape{
    private double wight;

    public Square(double width) {
        this.wight = width;
    }

    public double getArea() {
        return wight * wight;
    }

    public double getPerimeter() {
        return 4*wight;
    }
}
