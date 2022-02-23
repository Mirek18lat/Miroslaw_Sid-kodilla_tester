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

}
