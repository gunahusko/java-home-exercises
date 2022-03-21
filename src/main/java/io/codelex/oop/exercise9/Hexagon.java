package io.codelex.oop.exercise9;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Hexagon extends Shape{
    private final BigDecimal sideLength;

    public Hexagon(double sideLength) {
        this.sideLength = new BigDecimal(sideLength);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return sideLength.multiply(new BigDecimal(6));
    }

    @Override
    public BigDecimal calculateArea() {
        MathContext mathContext = new MathContext(10);
        BigDecimal three = new BigDecimal(3);
        RoundingMode roundingMode = RoundingMode.valueOf(2);

        return three.multiply(three.sqrt(mathContext)).divide(new BigDecimal(2), roundingMode).multiply(sideLength.pow(2));
    }

    @Override
    public String toString() {
        return "Hexagon {" +
                "sideLength = " + sideLength +
                '}';
    }
}
