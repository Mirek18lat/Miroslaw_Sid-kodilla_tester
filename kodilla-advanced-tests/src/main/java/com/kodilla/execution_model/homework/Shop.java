package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Shop {
    List<Order> orders = new ArrayList<>();


    public List<Order> returnListFrom2Year(){
        List<Order> shops  = new ArrayList<>();
        shops = orders
            .stream()
            .filter(u->u.getDate().isAfter(LocalDate.now().minusYears(2)))
            .collect(Collectors.toList());
    return shops;
    }

    public double getMaxValueOrder(){
        Optional<Order> orderMax = orders.stream().max(Comparator.comparingDouble(u->u.getAmount()));

        return orderMax.get().amount;
    }

    public double getMinValueOrder(){
        Optional<Order> orderMax = orders.stream().min(Comparator.comparingDouble(u->u.getAmount()));

        return orderMax.get().amount;
    }

    public double returnSum(){
        double sum  = orders
                .stream()
                .collect(Collectors.summingDouble(Order::getAmount));
        return sum;
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
