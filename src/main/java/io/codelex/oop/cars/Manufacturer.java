package io.codelex.oop.cars;

import java.util.Objects;

public class Manufacturer{
    private String NAME;
    private int YEAR;
    private String COUNTRY;

    public Manufacturer(String NAME, int YEAR, String COUNTRY) {
        this.NAME = NAME;
        this.YEAR = YEAR;
        this.COUNTRY = COUNTRY;
    }

    public Manufacturer(String name) {
        this.NAME = name;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String name) {
        this.NAME = name;
    }

    public int getYEAR() {
        return YEAR;
    }

    public void setYEAR(int year) {
        this.YEAR = year;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String country) {
        this.COUNTRY = country;
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
        return getYEAR() == that.getYEAR() && getNAME().equals(that.getNAME()) && getCOUNTRY().equals(that.getCOUNTRY());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNAME(), getYEAR(), getCOUNTRY());
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name = '" + NAME + '\'' +
                ", established = " + YEAR +
                ", country = '" + COUNTRY + '\'' +
                '}';
    }
}
