package io.codelex.oop.exercise9;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Triangle extends Shape{
    private final BigDecimal aSideLength;
    private final BigDecimal bSideLength;
    private final BigDecimal cSideLength;

    public Triangle(double aSideLength, double bSideLength, double cSideLength) {
        this.aSideLength = new BigDecimal(aSideLength);
        this.bSideLength = new BigDecimal(bSideLength);
        this.cSideLength = new BigDecimal(cSideLength);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return aSideLength.add(bSideLength).add(cSideLength);
    }

    @Override
    public BigDecimal calculateArea() {
        RoundingMode roundingMode = RoundingMode.valueOf(2);
        BigDecimal semiPerimeter = calculatePerimeter().divide(new BigDecimal(2), roundingMode);
        MathContext mathContext = new MathContext(10);
        return semiPerimeter.multiply(semiPerimeter.subtract(aSideLength)).multiply(semiPerimeter.subtract(bSideLength).multiply(semiPerimeter.subtract(cSideLength))).sqrt(mathContext);
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "aSideLength = " + aSideLength +
                ", bSideLength = " + bSideLength +
                ", cSideLength = " + cSideLength +
                '}';
    }
}

