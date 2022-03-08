package io.codelex.classesandobjects.exercises;

public class Odometer {
    private int mileage;  // km

    public Odometer(int mileage) {
        this.mileage = mileage;
    }

    public void reportMileage() {
        System.out.println("Current mileage: " + this.mileage + "km");
    }

    public void increaseMileage(FuelGauge gauge) {
        for(int i = 0; i<=10; i++) {
            this.mileage++;
            if (this.mileage == 1000) this.mileage = 0;
        }
        gauge.fuelConsumption();
        if (gauge.getAmountOfFuel() > 0) increaseMileage(gauge);
    }

    @Override
    public String toString() {
        return "Odometer{" +
                "mileage=" + mileage +
                '}';
    }
}
