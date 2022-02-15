package com.kodilla.exception.homework;

import java.util.Optional;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order1"));
        warehouse.addOrder(new Order("Order2"));
        warehouse.addOrder(new Order("Order3"));
        warehouse.addOrder(new Order("Order4"));
        warehouse.addOrder(new Order("Order5"));
        warehouse.addOrder(new Order("Order6"));


    try {
        Order order3 =  warehouse.getOrder( "Order9");
        System.out.println("You find your order : " + order3 +". Check another one.");
        } catch (OrderDoesntExistException e) {
            System.out.println("The order doesn't exist in warehouse database. Please try another number.");
        }

    }
}
