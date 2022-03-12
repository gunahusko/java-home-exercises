package io.codelex.dateandtime.practice;
import java.time.*;
import java.util.Scanner;

public class LocalDate {

    public static void main(String[] args) {
        System.out.println("Enter two dates and it will calculate" +
                " how many hours regular office employee works in that period of time.");

        System.out.println("Enter first date (from): ");
        java.time.LocalDate d1 = userEnters();
        System.out.println("Enter second date (until): ");
        java.time.LocalDate d2 = userEnters();

        System.out.println("From: " + d1);
        System.out.println("Until: " + d2);
        System.out.print("Working hours: ");

        Period period = Period.between(d1, d2);
        int days = period.getDays();

        calculateWorkingHours(d1, days);
    }

    private static java.time.LocalDate userEnters() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = in.nextInt();
        System.out.print("Enter month: ");
        int month = in.nextInt();
        System.out.print("Enter day: ");
        int day = in.nextInt();

        return java.time.LocalDate.of(year, month, day);
    }

    private static void calculateWorkingHours(java.time.LocalDate d1, int days) {
        int workingHours = 8;
        int countWorkingDays = days;

        for (long i=0; i<days; i++) {
            java.time.LocalDate startDate = d1.plusDays(i);
                if(startDate.getDayOfWeek() == DayOfWeek.SATURDAY || startDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                    countWorkingDays--;
                }
        }

        int totalWorkingHours = countWorkingDays * workingHours;
        System.out.println(totalWorkingHours);
    }
}

