package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
@Scope("prototype")
public class Clock {


    public LocalDateTime localDateTime() {
        LocalDateTime timeNow = LocalDateTime.now();

        return  timeNow;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
