package io.codelex.oop.exercise9;

public class testShapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle);
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
        System.out.println("Triangle area: " + triangle.calculateArea());

        Hexagon hexagon = new Hexagon(9);
        System.out.println(hexagon);
        System.out.println("Hexagon perimeter: " + hexagon.calculatePerimeter());
        System.out.println("Hexagon area: " + hexagon.calculateArea());
    }
}
