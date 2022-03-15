package io.codelex.oop.shapes;

public abstract class Shape {
    private final int NUM_SIDES;

    public Shape(int numSides) {
        this.NUM_SIDES = numSides;
    }

    public int getNUM_SIDES() {
        return NUM_SIDES;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
