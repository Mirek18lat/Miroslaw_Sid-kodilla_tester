package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {

    List<String> users = new ArrayList<>();

    public User(String... users) {
        for (String user : users)
            this.users.add(user);
    }

    void receiveGlobalNotification(Notification notification) {};

}
