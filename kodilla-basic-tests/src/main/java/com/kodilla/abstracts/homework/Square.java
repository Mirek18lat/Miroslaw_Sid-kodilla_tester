package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square(double a) {
        this.a = a;
    }
    @Override
    public double calcPerimeter() {
        return a*4;
    }

    @Override
    public double calcArea() {
        return a*a;
    }
}
