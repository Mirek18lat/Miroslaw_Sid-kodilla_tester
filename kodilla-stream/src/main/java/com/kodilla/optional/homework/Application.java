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
        students.add(new Student("Gale Boetticher", null));
        students.add(new Student("Mike Ehrmantraute", null));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.teacher);
            Teacher teacherName = optionalTeacher.orElse(new Teacher("<undefined>"));
            System.out.println("uczeń: " + student.name + ", " + teacherName);
        }
    }
}

