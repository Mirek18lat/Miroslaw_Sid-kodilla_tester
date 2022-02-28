package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;

public class Location {
    User user;
    String location;

    Location(User user, String location){
        this.user = user;
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
