package io.codelex.classesandobjects.exercises;

public class FuelGauge {
    private int amountOfFuel;  // in liters

    public FuelGauge(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public void reportAmountOfFuel() {
        System.out.println("Current amount of fuel: " + this.amountOfFuel + "l");
    }

    public void fillUp() {
        while (this.amountOfFuel < 70) {
            this.amountOfFuel++;
        }
    }

    public void fuelConsumption() {
        if (this.amountOfFuel > 0) this.amountOfFuel--;
    }

    @Override
    public String toString() {
        return "FuelGauge{" +
                "amountOfFuel=" + amountOfFuel +
                '}';
    }
}
