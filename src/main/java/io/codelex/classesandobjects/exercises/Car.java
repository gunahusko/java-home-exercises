package io.codelex.classesandobjects.exercises;

public class Car { //A class that calculates liter per kilometers.
    private double startKilometers; // Starting odometer reading
    private double endKilometers; // Ending odometer reading
    private double liters; // Liters of gas used between the readings

    public Car() {
    }

    public Car(double startOdo, double endingOdo, double liters) {
        this.startKilometers = startOdo;
        this.endKilometers = endingOdo;
        this.liters = liters;
    }

    public Car(double startOdo) {
        this.startKilometers = startOdo;
    }

    public double getStartKilometers() {
        return startKilometers;
    }

    public void setStartKilometers(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    public double getEndKilometers() {
        return endKilometers;
    }

    public void setEndKilometers(double endKilometers) {
        this.endKilometers = endKilometers;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    public double calculateConsumption() {
        return (this.endKilometers - this.startKilometers) / this.liters;

    }

    boolean gasHog() {
        return (calculateConsumption() > 15.0); // km/l > l/km ??
    }

    boolean economyCar() {
        return (calculateConsumption() < 5.0);
    }

    public void fillUp(int mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;
    }

    @Override
    public String toString() {
        return "Car{" +
                "startKilometers=" + startKilometers +
                ", endKilometers=" + endKilometers +
                ", liters=" + liters +
                '}';
    }
}
