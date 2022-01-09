package com.kodilla.abstracts.homework;

public class Person {
    public String firstName;
    public int age;
    private Job job;

    public Person(String firstName, int age,Job job){
        this.firstName= firstName;
        this.age= age;
        this.job= job;
    }

    public String checkJob() {
        Person marek = new Person("marek", 30, new Driver());
        return job.getResponsibilities();
    }
}
