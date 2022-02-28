package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NotificationWeatherServices {
    private Set<Location> locations = new HashSet<>();
    List<User> allUsers = new ArrayList<>();

    public void addSubscriber (Location location) {
        this.locations.add(location);
        allUsers.add(location.getUser());
    }

    public void sendNotificationLocationSubscriber (Notification notification) {
        this.locations.forEach(location -> location.receiveWeatherNotification(notification));
    }

/*    public void sendNotificationAllSubscriber (Notification notification) {
        locations.forEach(location -> location.receiveWeatherNotification(notification));
    }*/
    
    public void sendGlobalNotification (Notification notification) {
        this.allUsers.forEach(user -> user.receiveGlobalNotification(notification));
    }

    public  void removeLocationSubscriber(Location location){
        this.locations.remove(location);
    }

}
