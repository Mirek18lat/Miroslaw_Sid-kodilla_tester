package com.kodilla.collections.adv.maps.homework;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal, School> principalSchoolMap = new HashMap<>();

        Principal jonBregovich= new Principal("John", "Bregovich");
        Principal arnoldSchwarzenegger= new Principal("Arnold", "Schwarzenegger");
        Principal andrzejGolota= new Principal("Andrzej", "Golota");
        Principal piotrRubik= new Principal("Piotr", "Rubik");


        School school1 = new School( 14, 20, 13, 21, 15, 9);
        School school2 = new School(11, 10, 13, 11, 25, 14);
        School school3 = new School(23, 35,22, 20, 12, 17);
        School school4 = new School(23, 12, 26, 19, 21, 23);

        principalSchoolMap.put(jonBregovich, school4);
        principalSchoolMap.put(arnoldSchwarzenegger, school3);
        principalSchoolMap.put(andrzejGolota, school2);
        principalSchoolMap.put(piotrRubik, school1);

        for (Map.Entry<Principal, School> principalEntry : principalSchoolMap.entrySet())
        System.out.println(principalEntry.getKey().getFirstname() +" " + principalEntry.getKey().getLastname() + " works in " + "Scool Name" + " where has "+ principalEntry.getValue().getSum() + " students");

    }

}
