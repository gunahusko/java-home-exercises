package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.util.Scanner;

public class DatePeriodTest {
    public static void main(String[] args) {
        System.out.println("Start date--------------1");
        LocalDate firstStartDate = userInput();
        System.out.println("End date----------------1");
        LocalDate firstEndDate = userInput();
        DatePeriod firstPeriod = new DatePeriod(firstStartDate, firstEndDate);
        System.out.println();

        System.out.println("Start date--------------2");
        LocalDate secondStartDate = userInput();
        System.out.println("End date----------------2");
        LocalDate secondEndDate = userInput();
        DatePeriod secondPeriod = new DatePeriod(secondStartDate, secondEndDate);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);
        System.out.println("Intersection " + overlap);
    }

    private static LocalDate userInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();
        System.out.print("Enter day: ");
        int day = input.nextInt();

        return LocalDate.of(year, month, day);
    }
}
