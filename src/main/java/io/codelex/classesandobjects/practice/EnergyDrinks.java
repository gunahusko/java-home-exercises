package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    private static final int NUMBERED_SURVEYED = 12467;
    private static final double PURCHASED_ENERGY_DRINKS = 0.14;
    private static final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + calculateEnergyDrinkers() + " bought at least one energy drink");
        System.out.println(calculatePreferCitris() + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers() {
        return NUMBERED_SURVEYED * PURCHASED_ENERGY_DRINKS;
    }

    public static double calculatePreferCitris() {
        return calculateEnergyDrinkers() * PREFER_CITRUS_DRINKS;
    }
}
