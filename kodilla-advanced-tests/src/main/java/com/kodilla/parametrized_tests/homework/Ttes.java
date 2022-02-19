package com.kodilla.parametrized_tests.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ttes {
    public static void main(String[] args) {
        Pattern compiledPattern = Pattern.compile("Marcin");
        Matcher matcher1 = compiledPattern.matcher("Nazywam sie Marcin Pietraszek");

        System.out.println(matcher1.find());
        System.out.println(matcher1.matches());
    }
}
