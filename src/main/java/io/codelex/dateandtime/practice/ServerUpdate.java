package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.util.Scanner;

public class ServerUpdate {
    public static void main(String[] args) {
        System.out.println("Enter server launched date: ");
        LocalDate d1 = userEnters();
        LocalDate dateNow = LocalDate.now();
        iterateBetweenDates(dateNow, d1);
    }

    private static LocalDate userEnters() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();
        System.out.print("Enter day: ");
        int day = input.nextInt();
        input.close();

        return LocalDate.of(year, month, day);
    }

    private static void iterateBetweenDates(LocalDate start, LocalDate end) {
        LocalDate dateIndex;
        for (dateIndex = start; dateIndex.isBefore(end);) {
            dateIndex = dateIndex.plusDays(14);
        }
        System.out.println("Last update: " + dateIndex);
        System.out.println("Next update: " + dateIndex.plusDays(14));
    }
}
