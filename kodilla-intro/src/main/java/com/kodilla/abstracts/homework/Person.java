package com.kodilla.abstracts.homework;

public class Person {
    public String firstName;
    public String age;
    public Job job;

    public Person(String firstName, String age,Job job){
        this.firstName= firstName;
        this.age= age;
        this.job= job;
    }

    public void checkJob() {
        job.getResponsibilities();

    }

}
