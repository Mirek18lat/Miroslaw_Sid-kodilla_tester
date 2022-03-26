package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;
    private double value;

    public Calculator(Display display) {
        this.display = display;
    }

    public String add(double a, double b) {
        value = a+b;
        return this.display.display(value);
    }

    public String subtract(double a, double b) {
        value = a-b;
        return this.display.display(value);
    }

    public String multiply(double a, double b) {
        value = a*b;
        return this.display.display(value);
    }

    public String divide(double a, double b) {
        value = a/b;
        return this.display.display(value);
    }


}
