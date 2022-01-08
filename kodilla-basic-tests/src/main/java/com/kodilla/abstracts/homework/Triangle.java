package com.kodilla.abstracts.homework;

public class Triangle extends Shape {


    public Triangle(double a, double b, double c) {
        this.a =a;
        this.b =b;
        this.c =c;
    }

    @Override
    public double calcArea() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double calcPerimeter() {
        double p = (a+b+c)/2;
        return p*2;
    }
}
