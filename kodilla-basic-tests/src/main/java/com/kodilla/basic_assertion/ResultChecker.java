package com.kodilla.basic_assertion;

public class ResultChecker {
    static boolean assertEqual(double expected, double actual, double delt) {
        return expected - actual < delt;
    }
}
