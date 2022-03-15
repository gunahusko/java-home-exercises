package io.codelex.oop.shapes;

public class Rectangle extends Shape{
    private final int WIDTH;
    private final int HEIGHT;

    public Rectangle(int width, int height) {
        super(4);
        this.WIDTH = width;
        this.HEIGHT = height;
    }

    @Override
    public double getArea() {
        return WIDTH * HEIGHT;
    }

    @Override
    public double getPerimeter() {
        return (WIDTH + HEIGHT) * 2;
    }

}
