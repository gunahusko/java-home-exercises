package io.codelex.oop.shapes;

public class Test {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4,5);
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle area: " + rectangle.getArea());

        Triangle triangle = new Triangle(3, 4);
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        System.out.println("Triangle area: " + triangle.getArea());
   }
}
