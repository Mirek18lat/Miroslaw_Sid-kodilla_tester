package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;
import com.kodilla.exception.AirportRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void getOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order1"));
        warehouse.addOrder(new Order("Order2"));
        warehouse.addOrder(new Order("Order3"));
        warehouse.addOrder(new Order("Order4"));
        warehouse.addOrder(new Order("Order5"));
        warehouse.addOrder(new Order("Order6"));
        //when
       //then

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("Order9"));
    }

}