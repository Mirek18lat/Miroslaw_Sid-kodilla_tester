package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;
import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    Set<Integer> userNumbers = new HashSet<>();
    @ParameterizedTest
    @CsvFileSource(resources = "/machineNumbers.csv")
    public void shouldCheckNumberTrue (String input) throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        String [] numbers = input.split(",");

        for (String e : numbers) {
            int number = Integer.parseInt(e);
            userNumbers.add(number);
        }
        assertEquals(6,gamblingMachine.howManyWins(userNumbers));
    }
}