package com.kodilla.abstracts.homework;

public class Circle extends Shape {


    public Circle(double r) {
        this.r =r;
    }

    @Override
    public double calcArea() {
        return PI * r;
    }

    @Override
    public double calcPerimeter() {
        return 2*PI*r;
    }
}
