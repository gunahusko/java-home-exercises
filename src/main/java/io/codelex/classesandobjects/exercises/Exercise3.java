package io.codelex.classesandobjects.exercises;

public class Exercise3 {
    public static void main(String[] args) {
        FuelGauge gauge = new FuelGauge(0);
        Odometer odo = new Odometer(0);

        gauge.reportAmountOfFuel();
        odo.reportMileage();
        System.out.println("-------------------");

        System.out.println("After refueling:");
        gauge.fillUp();
        gauge.reportAmountOfFuel();
        System.out.println("-------------------");

        System.out.println("After the trip: ");
        odo.increaseMileage(gauge);
        gauge.reportAmountOfFuel();
        odo.reportMileage();
    }
}
