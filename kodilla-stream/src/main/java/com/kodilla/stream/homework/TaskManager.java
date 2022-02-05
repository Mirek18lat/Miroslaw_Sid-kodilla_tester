package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> tasksDeadline = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline().isAfter((LocalDate.now())))
                .map(TaskManager::getDealineTask)
                .collect(Collectors.toList());
        System.out.println(tasksDeadline);

    }

    public static LocalDate getDealineTask (Task task) {
        return task.getDeadline();
    }
}
