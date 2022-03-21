package io.codelex.oop.exercise10;

import java.math.BigDecimal;
import java.math.MathContext;

public class Cone extends _3DShape{
    private final BigDecimal height;
    private final BigDecimal radius;

    public Cone(double height,double radius) {
        this.height = new BigDecimal(height);
        this.radius = new BigDecimal(radius);
    }

    @Override
    public BigDecimal calculateVolume() {
        MathContext mathContext = new MathContext(10);
        return radius.pow(2).multiply(height).multiply(BigDecimal.valueOf(Math.PI)).divide(new BigDecimal(3), mathContext);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        MathContext mathContext = new MathContext(10);
        BigDecimal hypotenuse = height.pow(2).add(radius.pow(2)).sqrt(mathContext);
        return hypotenuse.add(hypotenuse).add(radius).add(radius);
    }

    @Override
    public BigDecimal calculateArea() {
        MathContext mathContext = new MathContext(10);
        BigDecimal hypotenuse = height.pow(2).add(radius.pow(2)).sqrt(mathContext);
        BigDecimal two = new BigDecimal(2);
        return two.multiply(BigDecimal.valueOf(Math.PI)).multiply(radius).multiply(two).add(hypotenuse.multiply(two));
    }

    @Override
    public String toString() {
        return "Cone {" +
                "height = " + height +
                ", radius = " + radius +
                '}';
    }
}
