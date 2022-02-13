package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Warehouse {
    Set<Order> orders = new HashSet<>();

    public Set<Order> addOrder(Order order) {
        orders.add(order);
        return orders;
    }
    public Set<Order> getOrder(String number) {
        try{ getOrders()
                 .stream()
                .filter(n -> n.getNumber().equals(number))
                .findAny().get();

        } catch (Exception e) {
            System.out.println("The order doesn't exist in warahaouse databese. Pleae try another number.");
        }
        return getOrders();
    }

    public Set<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
