package io.codelex.classesandobjects.exercises;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if (month <= 0 || month > 12) {
            System.out.println("Invalid month number!");
        } else {
            this.month = month;
        }
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        if (day <= 0 || day > 31) {
            System.out.println("Invalid day number!");
        } else {
            this.day = day;
        }
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year <= 1 || year > 2022) {
            System.out.println("Invalid year number!");
        } else {
            this.year = year;
        }
    }

    public void displayDate() {
        System.out.printf("%02d/%02d/%04d", month, day, year);
        System.out.println();
    }
}
