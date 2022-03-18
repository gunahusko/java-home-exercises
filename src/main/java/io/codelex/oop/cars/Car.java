package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car{
    private final String NAME;
    private final String MODEL;
    private int price;
    private final int YEAR;
    private final EngineType ENGINE_TYPE;
    private List<Manufacturer> manufacturer;

    public Car(String name, String model, int price, int year, EngineType engineType, Manufacturer manufacturer) {
        this.NAME = name;
        this.MODEL = model;
        this.price = price;
        this.YEAR = year;
        this.ENGINE_TYPE = engineType;
        this.manufacturer = new ArrayList<>();
        this.manufacturer.add(manufacturer);
    }

    public String getNAME() {
        return NAME;
    }

    public String getMODEL() {
        return MODEL;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYEAR() {
        return YEAR;
    }

    public List<Manufacturer> getManufacturer() {
        return manufacturer;
    }

    public void addManufacturer(Manufacturer manufacturer) {
        this.manufacturer.add(manufacturer);
    }

    public EngineType getENGINE_TYPE() {
        return ENGINE_TYPE;
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
               getYEAR() == car.getYEAR() &&
               getNAME().equals(car.getNAME()) &&
               getMODEL().equals(car.getMODEL()) &&
               getManufacturer().equals(car.getManufacturer()) &&
               getENGINE_TYPE() == car.getENGINE_TYPE();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNAME(),
                       getMODEL(),
                       getPrice(),
                       getYEAR(),
                       getManufacturer(),
                       getENGINE_TYPE());
    }

    @Override
    public String toString() {
        return "Car{" +
                "name = '" + NAME + '\'' +
                ", model = '" + MODEL + '\'' +
                ", price = " + price +
                ", year = " + YEAR +
                ", engineType = " + ENGINE_TYPE +
                ", manufacturer = " + manufacturer +
                '}';
    }
}
