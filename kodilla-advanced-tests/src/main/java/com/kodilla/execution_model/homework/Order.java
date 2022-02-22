package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    double amount;
    LocalDate date;
    String login;

    public Order(double amount, LocalDate date, String login) {
        this.amount = amount;
        this.date = date;
        this.login = login;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Order{" +
                "amount=" + amount +
                ", date='" + date + '\'' +
                ", login='" + login + '\'' +
                '}';
    }

    public static List<Order> getOrderList() {
        List<Order> orders2 = new ArrayList<>();
        orders2.add (new Order(20.00, LocalDate.of(2022, 1, 31), "MRSID"));
        orders2.add (new Order(40.00, LocalDate.of(2021, 2, 25), "DAWLAW"));
        orders2.add (new Order(15.00, LocalDate.of(2020, 3, 31), "MICLIP"));
        orders2.add (new Order(15.00, LocalDate.of(2019, 8, 9), "ANDPOL"));
        orders2.add (new Order(19.00, LocalDate.of(2018, 1, 16), "MRSID"));
        orders2.add (new Order(65.00, LocalDate.of(2015, 2, 26), "DAWLAW"));
        orders2.add (new Order(105.00, LocalDate.of(2018, 3, 22), "MICLIP"));
        orders2.add (new Order(60.00, LocalDate.of(2014, 8, 10), "ANDPOL"));
        return orders2;
    }
}
