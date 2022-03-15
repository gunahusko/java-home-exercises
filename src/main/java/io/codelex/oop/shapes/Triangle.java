package io.codelex.oop.shapes;

public class Triangle extends Shape{
    private final int WIDTH;
    private final int HEIGHT;

    public Triangle(int width, int height) {
        super(3);
        this.WIDTH = width;
        this.HEIGHT = height;
    }

    @Override
    public double getArea() {
        return (WIDTH * HEIGHT) / 2.0;
    }

    @Override
    public double getPerimeter() {
        return WIDTH + HEIGHT + Math.sqrt(Math.pow(WIDTH, 2) + Math.pow(HEIGHT, 2));
    }
}
