package com.kodilla.collections.adv.exercises.dictionary.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {

    Map<String, List<Flight>> warsaw = new HashMap<>();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> findFrom = warsaw.getOrDefault(departure, new ArrayList<>());

        warsaw.put(departure, findFrom);
        return findFlightsFrom(departure);

    };
    public List<Flight> findFlightsTo(String arrival) {
        return findFlightsTo(arrival);
    };

}
