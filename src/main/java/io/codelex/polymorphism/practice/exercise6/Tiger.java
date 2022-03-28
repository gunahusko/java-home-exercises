package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Tiger extends Felime {

    public Tiger(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(String food) {
        if (!food.equals("meat")) {
            System.out.println("Tigers are not eating that type of food!");
            foodEaten = 0;
        } else {
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.#");
        return "Tiger[" + animalName + ", " + animalType + ", " + format.format(animalWeight) + ", " + livingRegion + ", " + foodEaten + "]";
    }
}
