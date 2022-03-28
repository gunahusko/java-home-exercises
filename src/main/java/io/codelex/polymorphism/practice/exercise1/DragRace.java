package io.codelex.polymorphism.practice.exercise1;

import java.util.Arrays;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        Audi audi = new Audi();
        Bmw bmw = new Bmw();
        Lexus lexus = new Lexus();
        Mazda mazda = new Mazda();
        Tesla tesla = new Tesla();
        Toyota toyota = new Toyota();

        List<Object> cars = Arrays.asList(audi, bmw, lexus, mazda, tesla, toyota);

        speedUpCars(cars);
        checkFastestCar(cars);
    }

    private static void speedUpCars(List<Object> cars) {
        for (int i = 0; i < 10; i++) {
            for (Object car : cars) {
                if (car instanceof Audi) {
                    ((Audi) car).speedUp();
                } else if (car instanceof Bmw) {
                    ((Bmw) car).speedUp();
                } else if (car instanceof Lexus) {
                    ((Lexus) car).speedUp();
                } else if (car instanceof Mazda) {
                    ((Mazda) car).speedUp();
                } else if (car instanceof Tesla) {
                    ((Tesla) car).speedUp();
                } else if (car instanceof Toyota) {
                    ((Toyota) car).speedUp();
                }

                if (i == 3) {
                    if (car instanceof Lexus) {
                        ((Lexus) car).useNitrousOxideEngine();
                    }
                    if (car instanceof Toyota) {
                        ((Toyota) car).useNitrousOxideEngine();
                    }
                }
            }
        }

    }

    private static void checkFastestCar(List<Object> cars) {
        int speed;
        int fastestSpeed = 0;
        String fastestCar = "";

        for (Object car : cars) {
            if (car instanceof Audi) {
                speed = Integer.parseInt(((Audi) car).showCurrentSpeed());
                if (speed > fastestSpeed) {
                    fastestSpeed = speed;
                    fastestCar = "Audi";
                }
            } else if (car instanceof Bmw) {
                speed = Integer.parseInt(((Bmw) car).showCurrentSpeed());
                if (speed > fastestSpeed) {
                    fastestSpeed = speed;
                    fastestCar = "Bmw";
                }
            } else if (car instanceof Lexus) {
                speed = Integer.parseInt(((Lexus) car).showCurrentSpeed());
                if (speed > fastestSpeed) {
                    fastestSpeed = speed;
                    fastestCar = "Lexus";
                }
            } else if (car instanceof Mazda) {
                speed = Integer.parseInt(((Mazda) car).showCurrentSpeed());
                if (speed > fastestSpeed) {
                    fastestSpeed = speed;
                    fastestCar = "Mazda";
                }
            } else if (car instanceof Tesla) {
                speed = Integer.parseInt(((Tesla) car).showCurrentSpeed());
                if (speed > fastestSpeed) {
                    fastestSpeed = speed;
                    fastestCar = "Tesla";
                }
            } else if (car instanceof Toyota) {
                speed = Integer.parseInt(((Toyota) car).showCurrentSpeed());
                if (speed > fastestSpeed) {
                    fastestSpeed = speed;
                    fastestCar = "Toyota";
                }
            }
        }

        System.out.println("The fastest car is: " + fastestCar + " with speed: " + fastestSpeed);
    }
}
