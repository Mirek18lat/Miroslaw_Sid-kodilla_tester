package com.kodilla.collections.lists.homework;
import com.kodilla.collections.arrays.homeworr.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Lada;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(37));
        cars.add(new Lada(50));
        cars.add(new Renault(20));

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }


        cars.remove(1);
        Renault renault = new Renault(20);
        cars.remove(renault);

        for (Car car : cars) {
            System.out.println("---------------------List after erase---------------------");
            CarUtils.describeCar(car);
        }

        System.out.println(cars.size());
    }
}
