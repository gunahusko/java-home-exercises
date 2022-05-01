package io.codelex.oop.exercise9;

import java.math.BigDecimal;

public class Rectangle extends Shape{
    private final BigDecimal xLength;
    private final BigDecimal yLength;

    public Rectangle(double xLength, double yLength) {
        this.xLength = new BigDecimal(xLength);
        this.yLength = new BigDecimal(yLength);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return xLength.add(yLength).multiply(new BigDecimal(2));
    }

    @Override
    public BigDecimal calculateArea() {
        return xLength.multiply(yLength);
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "xLength = " + xLength +
                ", yLength = " + yLength +
                '}';
    }
}
