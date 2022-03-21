package io.codelex.oop.exercise10;

import java.math.BigDecimal;

public class Cube extends _3DShape{
    private final BigDecimal sideLength;

    public Cube(double sideLength) {
        this.sideLength = new BigDecimal(sideLength);
    }

    @Override
    public BigDecimal calculateVolume() {
        return sideLength.pow(3);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return sideLength.multiply(new BigDecimal(14));
    }

    @Override
    public BigDecimal calculateArea() {
        return sideLength.pow(2).multiply(new BigDecimal(6));
    }

    @Override
    public String toString() {
        return "Cube {" +
                "sideLength = " + sideLength +
                '}';
    }
}
