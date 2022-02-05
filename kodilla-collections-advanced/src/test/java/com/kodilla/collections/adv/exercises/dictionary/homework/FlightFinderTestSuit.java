package com.kodilla.collections.adv.exercises.dictionary.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuit {

    @Test
    public void testFindFlightsFrom() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //WHEN
        List<Flight> result = flightFinder.findFlightsFrom("Warszawa");
        //then
        assertEquals(2, result.size());
    }

    @Test
    public void testFindFlightsTo() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //WHEN
        List<Flight> result = flightFinder.findFlightsTo("Warszawa");
        //then
        assertEquals(3, result.size());
    }

}