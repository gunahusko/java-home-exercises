package io.codelex.arithmetic.practice;

// import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;
import java.math.MathContext;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {

        if (radius.signum() < 0) {
            throw new RuntimeException("An error message.");
        }

        BigDecimal PI = new BigDecimal(Math.PI);
        BigDecimal areaCircle = radius.multiply(radius).multiply(PI);
        MathContext m = new MathContext(4);
        BigDecimal areaCircle2 = areaCircle.round(m);
        return areaCircle2.doubleValue();
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {

        if (length.signum() < 0 || width.signum() < 0) {
            throw new RuntimeException("An error message.");
        }

        BigDecimal areaRectangle = length.multiply(width);
        MathContext m = new MathContext(4);
        BigDecimal areaRectangle2 = areaRectangle.round(m);
        return areaRectangle2.doubleValue();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal height) {

        if (base.signum() < 0 || height.signum() < 0) {
            System.out.println("An error message.");
        }

        BigDecimal halfOfOne = new BigDecimal("0.50");
        BigDecimal areaTriangle = halfOfOne.multiply(base).multiply(height);
        MathContext m = new MathContext(4);
        BigDecimal areaTriangle2 = areaTriangle.round(m);
        return areaTriangle2.doubleValue();
    }
}
