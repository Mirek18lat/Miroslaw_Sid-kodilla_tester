package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarConfigurationTestSuite {

    @Test
    public void shouldReturnSUV() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("chooseCar");
        //When
        String name = car.getCarType();
        //Then
        List<String> possibleCar = Arrays.asList("SUV", "Cabrio", "Sedan");
        Assertions.assertTrue(possibleCar.contains(name));
    }

    @Test
    public void shouldHaveLightAccordingActualTime() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("chooseCar");
        //When
        boolean name = car.hasHeadlightsTurnedOn();
        //Then
        Assertions.assertFalse(name);
    }
}