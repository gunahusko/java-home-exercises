package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person{
    private final String position;
    private final LocalDate date;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate date) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.date = date;
    }

    public int getWorkExperience() {
        Period period = Period.between(LocalDate.now(), date);
        return Math.abs(period.getYears());
    }

    @Override
    public String getInfo() {
        return  position + " " + super.getFirstName() + " " + super.getLastName() + " works since " + date + " (" + getWorkExperience() + " year experience)";
    }
}
