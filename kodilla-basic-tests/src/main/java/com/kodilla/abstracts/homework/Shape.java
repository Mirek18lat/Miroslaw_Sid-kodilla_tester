package com.kodilla.abstracts.homework;

public abstract class Shape {
    public double a;
    public double b;
    public double c;
    public double p;
    public double PI = 3.1415927;
    public double r;


    public double calcArea(){
        return b * a;
    }
    public double calcPerimeter(){
       return a*2+b*2;
    }

}
