package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    static Stream<Arguments> provideStringsForTestingGetBMI () {
        return Stream.of(
                Arguments.of(1.9, 50.00,"Very severely underweight"),
                Arguments.of(1.8, 50.00,"Severely underweight"),
                Arguments.of(1.7, 50.00,"Underweight"),
                Arguments.of(1.8, 70.00,"Normal (healthy weight)"),
                Arguments.of(1.8, 95.00,"Overweight"),
                Arguments.of(1.8, 110.00,"Obese Class I (Moderately obese)"),
                Arguments.of(1.8, 125.00,"Obese Class II (Severely obese)"),
                Arguments.of(1.8, 133.00,"Obese Class III (Very severely obese)"),
                Arguments.of(1.8, 150.00,"Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.8, 170.00,"Obese Class V (Super Obese)")


                );
    }

}
