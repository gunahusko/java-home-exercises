package io.codelex.oop.exercise10;

public class testShapes {
    public static void main(String[] args) {
        Cone cone = new Cone(3, 9);
        System.out.println(cone);
        System.out.println("Cone perimeter: " + cone.calculatePerimeter());
        System.out.println("Cone area: " + cone.calculateArea());
        System.out.println("Cone volume: " + cone.calculateVolume());

        Cube cube = new Cube(4);
        System.out.println(cube);
        System.out.println("Cube perimeter: " + cube.calculatePerimeter());
        System.out.println("Cube area: " + cube.calculateArea());
        System.out.println("Cube volume: " + cube.calculateVolume());
    }
}
