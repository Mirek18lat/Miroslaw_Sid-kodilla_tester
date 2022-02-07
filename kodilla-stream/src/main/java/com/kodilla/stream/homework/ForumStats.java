package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgMore40 = UsersRepository.getUsersList()
                .stream()
                .filter(u-> u.getAge() >= 40)
                .map(u-> u.getNumberOfPost())
                .mapToInt(n->n)
                .average()
                .getAsDouble();
        System.out.println(avgMore40);

        double avgLess40 = UsersRepository.getUsersList()
                .stream()
                .filter(u-> u.getAge() < 40)
                .map(u-> u.getNumberOfPost())
                .mapToInt(n->n)
                .average()
                .getAsDouble();
        System.out.println(avgLess40);
    }


}
