package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;

public class Location {
    String location;

    Location(String location){
        this.location = location;
    }

    void receiveWeatherNotification(Notification notification) {};

    public User getUser() {
        return user;
    }

    public String getLocation() {
        return location;
    }
}
