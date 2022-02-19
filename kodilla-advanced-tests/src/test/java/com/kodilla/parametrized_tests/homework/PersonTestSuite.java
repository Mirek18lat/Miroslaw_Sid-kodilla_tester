package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {


    @ParameterizedTest
    @MethodSource(value= "com.kodilla.parametrized_tests.homework.PersonSource#provideStringsForTestingGetBMI")
    public void shouldGenerateSameComment(double heightInMeters, double weightInKilogram,  String expected) {
        Person personBMI = new Person(heightInMeters, weightInKilogram);
        assertEquals(expected, personBMI.getBMI());
    }


}