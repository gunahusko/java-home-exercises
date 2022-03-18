package io.codelex.classesandobjects.exercises;

public class FuelGauge {
    private static final int FUEL_TANK = 70;
    private int amountOfFuel;  // in liters

    public FuelGauge(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public void reportAmountOfFuel() {
        System.out.println("Current amount of fuel: " + amountOfFuel + "l");
    }

    public void fillUp() {
        while (amountOfFuel < FUEL_TANK) {
            amountOfFuel++;
        }
    }

    public void fuelConsumption() {
        if (amountOfFuel > 0) {
            amountOfFuel--;
        }
    }

    @Override
    public String toString() {
        return "FuelGauge{" +
                "amountOfFuel=" + amountOfFuel +
                '}';
    }
}
