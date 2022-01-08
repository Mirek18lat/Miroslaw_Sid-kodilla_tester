package com.kodilla.abstracts.homework;

public class Person {
    public String firstName;
    public String age;
    public String job;

    public Person(String firstName, String age,String job){
        this.firstName= firstName;
        this.age= age;
        this.job= job;
    }

    public boolean checkJob() {
        if (this.job == "Tester") {
            Job tester = new Tester();
            System.out.println(tester.getResponsibilities());
        } else if (this.job == "President") {
            Job president = new President();
            System.out.println(president.getResponsibilities());
        } else if (this.job == "Driver") {
            Job driver = new Driver();
            System.out.println(driver.getResponsibilities());
        }
        return false;
    }

}
