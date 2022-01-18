package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Ford ford = new Ford(5);
        doRace(ford);

        Renault renault = new Renault(20);
        doRace(renault);

        Lada lada = new Lada(5);
        doRace(ford);
        
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
        }
}
