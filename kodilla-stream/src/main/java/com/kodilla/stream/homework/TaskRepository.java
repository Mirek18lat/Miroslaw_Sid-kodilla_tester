package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Buy car", LocalDate.of(2022,1,31), LocalDate.of(2022,7,31)));
        tasks.add(new Task("Go to cinema", LocalDate.of(2022,1,31), LocalDate.of(2022,2,3)));
        tasks.add(new Task("Read a book", LocalDate.of(2022,1,1), LocalDate.of(2022,2,5)));
        tasks.add(new Task("Driver licence", LocalDate.of(2022,1,31), LocalDate.of(2022,5,31)));
        tasks.add(new Task("Plan vacation", LocalDate.of(2022,1,31), LocalDate.of(2022,5,31)));
        tasks.add(new Task("Go to vacation", LocalDate.of(2022,1,31), LocalDate.of(2022,9,1)));
        tasks.add(new Task("English cources", LocalDate.of(2022,2,6), LocalDate.of(2022,3,1)));
        return tasks;

    }
}
