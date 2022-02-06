package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Walter White", new Teacher("Arnold  Schwarzenegger")));
        students.add(new Student("Jessie Pinkman", new Teacher("Sylvester Stallone")));
        students.add(new Student("Tuco Salamanca", new Teacher("Sylvester Stallone")));
        students.add(new Student("Gus Firing", new Teacher("Arnold  Schwarzenegger")));
        students.add(new Student("Gale Boetticher", new Teacher("")));
        students.add(new Student("Mike Ehrmantraute", new Teacher("")));

        for (Student student : students) {
            Optional<Student> optionalStudents = Optional.ofNullable(student).orElse( "<undefined>");

            optionalStudents.ifPresent(u -> System.out.println(u.getTeacher()));
        }
    }
}
