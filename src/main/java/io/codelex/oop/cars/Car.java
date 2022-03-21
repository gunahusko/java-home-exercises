package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car{
    private final String name;
    private final String model;
    private int price;
    private final int year;
    private final EngineType engineType;
    private final List<Manufacturer> manufacturer;

    public Car(String name, String model, int price, int year, EngineType engineType, Manufacturer manufacturer) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.year = year;
        this.engineType = engineType;
        this.manufacturer = new ArrayList<>();
        this.manufacturer.add(manufacturer);
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public List<Manufacturer> getManufacturer() {
        return manufacturer;
    }

    public void addManufacturer(Manufacturer manufacturer) {
        this.manufacturer.add(manufacturer);
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return getPrice() == car.getPrice() &&
               getYear() == car.getYear() &&
               getName().equals(car.getName()) &&
               getModel().equals(car.getModel()) &&
               getManufacturer().equals(car.getManufacturer()) &&
               getEngineType() == car.getEngineType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),
                       getModel(),
                       getPrice(),
                       getYear(),
                       getManufacturer(),
                       getEngineType());
    }

    @Override
    public String toString() {
        return "Car{" +
                "name = '" + name + '\'' +
                ", model = '" + model + '\'' +
                ", price = " + price +
                ", year = " + year +
                ", engineType = " + engineType +
                ", manufacturer = " + manufacturer +
                '}';
    }
}
