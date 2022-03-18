package io.codelex.classesandobjects.exercises;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main( String[] args )  {

        Car car = new Car(10 , 50 , 2);
        userEntersValues(car);
        printResult(car);

        Car car2 = new Car();
        userEntersValues(car2);
        printResult(car2);

        Car car3 = new Car();
        userEntersValues(car3);
        printResult(car3);
    }

    public static void printResult(Car car) {
        System.out.printf("Kilometers per liter are %.2f l/km", car.calculateConsumption());
        System.out.println();
        if (car.gasHog()) {
            System.out.println("This is a gas hog!");
        }
        if (car.economyCar()) {
            System.out.println("This is an economy car.");
        }
        if (!car.gasHog() && !car.economyCar()) {
            System.out.println("This is a mid-range machine.");
        }
        System.out.println();
    }

    public static void userEntersValues(Car car) {
        Scanner scan = new Scanner(System.in);

        double startKilometers;
        double endKilometers;
        double liters;

        System.out.print("Enter first reading (startKilometers): ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading (endKilometers): ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();
        System.out.println();

        car.setStartKilometers(startKilometers);
        car.setEndKilometers(endKilometers);
        car.setLiters(liters);
    }

}
