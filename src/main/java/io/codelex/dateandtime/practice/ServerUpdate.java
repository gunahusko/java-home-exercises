package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class ServerUpdate {
    public static void main(String[] args) {
        System.out.println("Enter server launched date: ");
        LocalDate launchedDate = input();

        System.out.println("Enter year (to update): ");
        Scanner user = new Scanner(System.in);
        int currentYear = user.nextInt();
        System.out.println("Enter month (with letters): ");
        user.nextLine();
        String currentMonth = user.nextLine().toUpperCase();

        atWhichDatesMustBeUpdated(launchedDate, currentYear, currentMonth);
    }

    private static LocalDate input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();
        System.out.print("Enter day: ");
        int day = input.nextInt();

        return LocalDate.of(year, month, day);
    }

    private static void atWhichDatesMustBeUpdated(LocalDate launchedDate, int year, String month) {
        LocalDate currentMonth = LocalDate.of(year, Month.valueOf(month), 1);

        LocalDate dateIndex;
        for (dateIndex = launchedDate; dateIndex.isBefore(currentMonth);) {
            dateIndex = dateIndex.plusDays(14);
        }

        System.out.println("First update in " + year + " " + month + ": " + dateIndex);
        System.out.println("Next update: " + dateIndex.plusDays(14));
    }
}
