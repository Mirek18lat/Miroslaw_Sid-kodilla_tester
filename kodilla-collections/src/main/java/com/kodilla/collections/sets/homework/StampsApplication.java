package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Morocco", 3, 4, false));
        stamps.add(new Stamp("Russia", 5, 6, true));
        stamps.add(new Stamp("Morocco", 3, 4, false));
        stamps.add(new Stamp("Paris", 2, 5, true));

        System.out.println(stamps.size());

        for (Stamp stamp: stamps)
            System.out.println(stamp);
    }
}
