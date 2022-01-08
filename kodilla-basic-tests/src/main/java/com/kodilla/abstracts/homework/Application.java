package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Square square = new Square(3);
        System.out.println("Area of the Square equals: " + square.calcArea());
        System.out.println("Perimeter of the Square equals: " + square.calcPerimeter());

        Circle circle = new Circle(3);
        System.out.println("Area of the Circle equals: " + circle.calcArea());
        System.out.println("Perimeter of the Circle equals: " + circle.calcPerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Area of the Triangle equals: " + triangle.calcArea());
        System.out.println("Perimeter of the Triangle equals: " + triangle.calcPerimeter());

    }
}
