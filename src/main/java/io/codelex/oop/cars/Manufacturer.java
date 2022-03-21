package io.codelex.oop.cars;

import java.util.Objects;

public class Manufacturer{
    private final String name;
    private final int year;
    private final String country;

    public Manufacturer(String name, int year, String country) {
        this.name = name;
        this.year = year;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Manufacturer)) {
            return false;
        }
        Manufacturer that = (Manufacturer) o;
        return getYear() == that.getYear() && getName().equals(that.getName()) && getCountry().equals(that.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYear(), getCountry());
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name = '" + name + '\'' +
                ", established = " + year +
                ", country = '" + country + '\'' +
                '}';
    }
}
