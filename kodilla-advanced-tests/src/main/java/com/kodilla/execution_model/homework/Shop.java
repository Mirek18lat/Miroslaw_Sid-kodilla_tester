package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Shop {
    private static List<Order> orders = new ArrayList<>();


    public static List<Order> returnListFrom2Year(){
        List<Order> shops  = new ArrayList<>();
        shops = orders
            .stream()
            .filter(u->u.getDate().isAfter(LocalDate.now().minusYears(2)))
            .collect(Collectors.toList());
        System.out.println(shops);
        return shops;
    }

    public static Optional getMaxValueOrder(){
        for (Order order: orders) {
            Optional<Order> orderMIN = Optional.ofNullable(orders.);

                .max();
            System.out.println(orderMIN);
        }
        return orderMIN;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public int getSize () {
        return this.orders.size();
    }


    @Override
    public String toString() {
        return "Shop{" +
                "orders=" + orders + '}';
    }
}
