package io.codelex.classesandobjects.exercises;

public class TestingCarFillUp {
    public static void main(String[] args) {

        Car car = new Car(1000);
        car.fillUp(2000, 50);

        System.out.printf( "Kilometers per liter are %.2f l/km", car.calculateConsumption());
        System.out.println();

        car.fillUp(3000, 50);
        System.out.printf( "Kilometers per liter are %.2f l/km", car.calculateConsumption());
        System.out.println();

        car.fillUp(4000, 50);
        System.out.printf( "Kilometers per liter are %.2f l/km", car.calculateConsumption());
        System.out.println();
    }
}
