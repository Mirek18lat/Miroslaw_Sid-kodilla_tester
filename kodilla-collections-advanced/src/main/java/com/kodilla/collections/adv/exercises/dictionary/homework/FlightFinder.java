package com.kodilla.collections.adv.exercises.dictionary.homework;

import java.util.*;

public class FlightFinder {

    List<Flight> flights = new ArrayList<>(FlightRepository.getFlightsTable());

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightFrom = new ArrayList<>();
        for (Flight findF : flights) {
            if (findF.getDeparture().equals(departure))
                flightFrom.add(findF);
        }
        System.out.println(flightFrom);
        return flightFrom;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightTo = new ArrayList<>();
        for (Flight findTo : flights) {
            if (findTo.getArrival().equals(arrival))
                flightTo.add(findTo);
        }
        System.out.println(flightTo);
        return flightTo;
    };



}
