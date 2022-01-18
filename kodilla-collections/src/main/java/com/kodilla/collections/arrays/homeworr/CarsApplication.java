package com.kodilla.collections.arrays.homeworr;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Lada;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(16)];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);

    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnShapeCar = random.nextInt(3);
        int speed = random.nextInt(100);

        if (drawnShapeCar == 0 )
            return new Ford(speed);
        else if (drawnShapeCar == 1)
            return new Renault(speed);
        else
            return new Lada(speed);
    }
}
