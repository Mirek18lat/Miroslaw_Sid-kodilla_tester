package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;

import java.util.*;

public class NotificationWeatherServices {


    public void addSubscriber (Location location, User user) {

        Map<Location, User> locationMap = new HashMap<>();

        User john = new User("John Stevenson");
        User jessie = new User("Jessie Pinkman");
        User bart = new User("Bart Simpson");

        Location berlin = new Location("Berlin");
        Location paris = new Location("Paris");
        Location kielce = new Location("Kielce");

        locationMap.put(berlin, john);
        locationMap.put(berlin, jessie);
        locationMap.put(kielce, john);
        locationMap.put(kielce, jessie);
        locationMap.put(paris, john);
        locationMap.put(paris, bart);
        for (Map.Entry<Location, User> locationUserEntry : locationMap.entrySet())
        System.out.println(locationUserEntry.getKey().getLocation() + "  " +locationUserEntry.getValue());
    }

/*    public void sendNotificationAllSubscriber (Notification notification) {
        locations.forEach(location -> location.receiveWeatherNotification(notification));
    }*/
    
/*
    public void sendGlobalNotification (Notification notification) {
        this.allUsers.forEach(user -> user.receiveGlobalNotification(notification));
    }

    public  void removeLocationSubscriber(Location location){
        this.locations.remove(location);
    }
*/

}
