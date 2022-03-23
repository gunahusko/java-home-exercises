package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Period;
import java.util.Scanner;

public class MyLocalDate {
    private static final int WORKING_HOURS = 8;

    public static void main(String[] args) {
        System.out.println("Enter two dates to calculate" +
                " how many hours employee worked in that period.");

        System.out.println("Enter first date (from): ");
        LocalDate startDate = userEnters();
        System.out.println("Enter second date (until): ");
        LocalDate endDate = userEnters();

        System.out.println("From: " + startDate);
        System.out.println("Until: " + endDate);
        System.out.print("Working hours: ");
        calculateWorkingHours(startDate, endDate);
    }

    private static LocalDate userEnters() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = in.nextInt();
        System.out.print("Enter month: ");
        int month = in.nextInt();
        System.out.print("Enter day: ");
        int day = in.nextInt();

        return LocalDate.of(year, month, day);
    }

    private static void calculateWorkingHours(LocalDate startDate, LocalDate endDate) {
        Period period = Period.between(startDate, endDate);
        int days = Math.abs(period.getDays() - 1);

        for (int i = 0; i < days; i++) {
            LocalDate between = startDate.plusDays(1);
            if(isWeekend(between)) {
                days--;
            }
        }

        int totalWorkingHours = days * WORKING_HOURS;
        System.out.println(totalWorkingHours);
    }

    private static boolean isWeekend(LocalDate between) {
        return between.getDayOfWeek() == DayOfWeek.SATURDAY || between.getDayOfWeek() == DayOfWeek.SUNDAY;
    }
}

