package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDateTime;


public class Sedan implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn() {

        if (LocalDateTime.now().getHour() >= 8 || LocalDateTime.now().getHour() <= 22 ) {
            return false;
        }
        return true;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
