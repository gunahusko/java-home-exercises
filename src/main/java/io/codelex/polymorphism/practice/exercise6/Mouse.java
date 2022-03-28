package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Mouse extends Mammal {

    public Mouse(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Pepeeeee...");
    }

    @Override
    public void eat(String food) {
        if (!food.equals("vegetable")) {
            System.out.println(animalType + " are not eating that type of food!");
            foodEaten = 0;
        } else {
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.#");
        return "Mouse[" + animalName + ", " + animalType + ", " + format.format(animalWeight) + ", " + livingRegion + ", " + foodEaten + "]";
    }
}
