package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherNotificationServicesTestSuite {
    NotificationWeatherServices notificationWeatherServices = new NotificationWeatherServices();
    Location location1 = Mockito.mock(Location.class);

    Notification notification = Mockito.mock(Notification.class);
/*

    @Test
    public void newRegisteredUserreceiveWeatherNotificationNotification() {
        notificationWeatherServices.addSubscriber(location1);

        notificationWeatherServices.sendNotificationLocationSubscriber(notification);
        Mockito.verify(location1, Mockito.times(1)).receiveWeatherNotification(notification);

    }

    @Test
    public void removeRegisteredUserFromReceivingNotification() {
        notificationWeatherServices.addSubscriber(location1);
        notificationWeatherServices.removeLocationSubscriber(location1);

        notificationWeatherServices.sendNotificationLocationSubscriber(notification);
        Mockito.verify(location1, Mockito.never()).receiveWeatherNotification(notification);

    }

*/
/*    @Test
    public void sendNotificationAllSubscriber() {
        Location location2 = Mockito.mock(Location.class);
        Location location3 = Mockito.mock(Location.class);
        notificationWeatherServices.addSubscriber(location);
        notificationWeatherServices.addSubscriber(location2);
        notificationWeatherServices.addSubscriber(location3);

        notificationWeatherServices.sendNotificationAllSubscriber(notification);
        Mockito.verify(location, Mockito.times(1)).receiveWeatherNotification(notification);
        Mockito.verify(location2, Mockito.times(1)).receiveWeatherNotification(notification);
        Mockito.verify(location3, Mockito.times(1)).receiveWeatherNotification(notification);

    }*//*


    @Test
    public void sendGlobalNotification() {
        Location location2 = Mockito.mock(Location.class);
        Location location3 = Mockito.mock(Location.class);
        notificationWeatherServices.addSubscriber(location1);
        notificationWeatherServices.addSubscriber(location2);
        notificationWeatherServices.addSubscriber(location3);

        User user1 = Mockito.mock(User.class);
        User user2 = Mockito.mock(User.class);
        User user3 = Mockito.mock(User.class);
        User user4 = Mockito.mock(User.class);
        User user5 = Mockito.mock(User.class);

        notificationWeatherServices.sendGlobalNotification(notification);
        Mockito.verify(location1, Mockito.times(1)).receiveWeatherNotification(notification);
        Mockito.verify(location2, Mockito.times(1)).receiveWeatherNotification(notification);
        Mockito.verify(location3, Mockito.times(1)).receiveWeatherNotification(notification);

    }
*/

}