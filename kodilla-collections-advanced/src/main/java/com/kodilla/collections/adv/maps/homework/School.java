package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Student;

import java.util.ArrayList;
import java.util.List;

public class School {

    List<Integer> classes = new ArrayList<>();

    public School(int... classes) {
        for (int classe : classes)
            this.classes.add(classe);
    }

    public int getSum() {
        int sum = 0;
        for (int classe : classes)
            sum+= classe;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "classes=" + classes +
                '}';
    }
}
