package com.kodilla.spring.basic.spring_configuration.homework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

@Configuration
public class CarConfiguration {
    Car car;
    @Bean
    public Car chooseCar () {

        if (LocalDateTime.now().getMonth() == Month.MARCH || LocalDateTime.now().getMonth() == Month.APRIL || LocalDateTime.now().getMonth() == Month.MAY || LocalDateTime.now().getMonth() == Month.SEPTEMBER || LocalDateTime.now().getMonth() == Month.OCTOBER || LocalDateTime.now().getMonth() == Month.NOVEMBER) {
            car = new Sedan();
        } else if (LocalDateTime.now().getMonth() == Month.JUNE || LocalDateTime.now().getMonth() == Month.JULY || LocalDateTime.now().getMonth() == Month.AUGUST) {
            car = new Cabrio();
        } else {car = new SUV();}
        return car;
    }

}
