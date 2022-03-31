package com.kodilla.spring.basic.spring_configuration.homework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

@Configuration
public class CarConfiguration {
    Car car;
    String season;
    @Bean
    public Car chooseCar () {

        if (isSpringSeason() || isAutumnSeason()) {
            car = new Sedan();
        } else if (isSummerSeason()) {
            car = new Cabrio();
        } else {car = new SUV();}
        return car;
    }

    public boolean isSpringSeason() {
        if (LocalDateTime.now().getMonth() == Month.MARCH || LocalDateTime.now().getMonth() == Month.APRIL || LocalDateTime.now().getMonth() == Month.MAY ) {
            return true;
        } else {return false;}
    }

    public boolean isSummerSeason() {
        if (LocalDateTime.now().getMonth() == Month.JUNE || LocalDateTime.now().getMonth() == Month.JULY || LocalDateTime.now().getMonth() == Month.AUGUST) {
            return true;
        } else {return false;}
    }

    public boolean isAutumnSeason() {
        if (LocalDateTime.now().getMonth() == Month.SEPTEMBER || LocalDateTime.now().getMonth() == Month.OCTOBER || LocalDateTime.now().getMonth() == Month.NOVEMBER) {
            return true;
        } else {return false;}
    }

    public boolean isWinterSeason() {
        if (LocalDateTime.now().getMonth() == Month.DECEMBER || LocalDateTime.now().getMonth() == Month.JANUARY || LocalDateTime.now().getMonth() == Month.FEBRUARY) {
            return true;
        } else {return false;}
    }

}
