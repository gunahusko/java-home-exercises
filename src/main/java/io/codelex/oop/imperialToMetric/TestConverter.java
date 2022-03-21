package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class TestConverter {

    public static void main(String[] args) {

        BigDecimal valueToYards = new BigDecimal("10");
        BigDecimal resultMetersToYards = MeasurementConverter.convert(ConversionType.METERS_TO_YARDS, valueToYards);
        System.out.printf("%-23s", "Meters to yards: ");
        System.out.println(resultMetersToYards);

        BigDecimal valueToMeters = new BigDecimal("100");
        BigDecimal resultYardsToMeters = MeasurementConverter.convert(ConversionType.YARDS_TO_METERS, valueToMeters);
        System.out.printf("%-23s", "Yards to meters: ");
        System.out.println(resultYardsToMeters);

        BigDecimal valueToInches = new BigDecimal("10");
        BigDecimal resultCentimetersToInches = MeasurementConverter.convert(ConversionType.CENTIMETERS_TO_INCHES, valueToInches);
        System.out.printf("%-23s", "Centimeters to inches: ");
        System.out.println(resultCentimetersToInches);

        BigDecimal valueToCentimeters = new BigDecimal("10");
        BigDecimal resultInchesToCentimeters = MeasurementConverter.convert(ConversionType.INCHES_TO_CENTIMETERS, valueToCentimeters);
        System.out.printf("%-23s", "Inches to centimeters: ");
        System.out.println(resultInchesToCentimeters);

        BigDecimal valueToMiles = new BigDecimal("10");
        BigDecimal resultKilometersToMiles = MeasurementConverter.convert(ConversionType.KILOMETERS_TO_MILES, valueToMiles);
        System.out.printf("%-23s", "Kilometers to miles: ");
        System.out.println(resultKilometersToMiles);

        BigDecimal valueToKilometers = new BigDecimal("10");
        BigDecimal resultMilesToKilometers = MeasurementConverter.convert(ConversionType.MILES_TO_KILOMETERS, valueToKilometers);
        System.out.printf("%-23s", "Miles to kilometers: ");
        System.out.println(resultMilesToKilometers);
    }

}
