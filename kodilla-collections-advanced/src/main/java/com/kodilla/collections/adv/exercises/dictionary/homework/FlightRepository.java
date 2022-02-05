package com.kodilla.collections.adv.exercises.dictionary.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Paryż"));
        flights.add(new Flight("Warszawa", "Szczecin"));
        flights.add(new Flight("Wrocław", "Warszawa"));
        flights.add(new Flight("Nicea", "Warszawa"));
        flights.add(new Flight("Praga", "Warszawa"));
        return flights;
    }

}
