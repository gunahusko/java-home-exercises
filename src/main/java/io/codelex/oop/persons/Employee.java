package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person{
    private final String POSITION;
    private final LocalDate DATE;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate date) {
        super(firstName, lastName, id, age);
        this.POSITION = position;
        this.DATE = date;
    }

    public int getWorkExperience() {
        Period period = Period.between(LocalDate.now(), DATE);
        return Math.abs(period.getYears());
    }

    @Override
    public String getInfo() {
        return  POSITION + " " + firstName + " " + lastName + " works since " + DATE + " (" + getWorkExperience() + " year experience)";
    }
}
