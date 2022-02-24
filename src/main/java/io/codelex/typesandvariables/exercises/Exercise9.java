package io.codelex.typesandvariables.exercises;

import java.util.Scanner;
import java.util.Formatter;

public class Exercise9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Test Data");
        System.out.print("Input distance in meters: ");
        float distanceInMeters = input.nextInt();
        System.out.print("Input hour: ");
        int hours = input.nextInt();
        System.out.print("Input minutes: ");
        int minutes = input.nextInt();
        System.out.print("Input seconds: ");
        int seconds = input.nextInt();
        input.close();

        int allSeconds = (hours * 60 * 60) + (minutes * 60) + seconds;
        float allHours = hours + minutes/60f + seconds/60f/60f;

        float distanceInMiles = distanceInMeters * 0.000621371192f;
        float distanceInKilometers = distanceInMeters / 1000;

        float speedMetersInSecond = distanceInMeters/allSeconds;
        float speedKilometersInHour = distanceInKilometers/allHours;
        float speedMilesInHour = distanceInMiles/allHours;


        System.out.println("Result:");
        System.out.printf("Your speed in meters/second is %.8f\n", speedMetersInSecond);
        System.out.printf("Your speed in km/h is %.8f\n", speedKilometersInHour);
        System.out.printf("Your speed in miles/h is %.8f", speedMilesInHour);
    }
}
