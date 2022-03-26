package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.SkypeMessageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldNotReturnError() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        String message = bean.display(40);
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldCalculateAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        String message = bean.add(40, 50);
        Assertions.assertEquals("Value is: " +  90.0, message);
    }

    @Test
    public void shouldCalculateSubtract() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        String message = bean.subtract(90, 50);
        Assertions.assertEquals("Value is: " +  40.0, message);
    }

    @Test
    public void shouldCalculateMultiply() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        String message = bean.multiply(40, 50);
        Assertions.assertEquals("Value is: " +  2000.0, message);
    }

    @Test
    public void shouldCalculateDivide() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        String message = bean.divide(100, 50);
        Assertions.assertEquals("Value is: " +  2.0, message);
    }
}