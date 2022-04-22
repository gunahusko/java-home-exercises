package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Ihouuum");
    }

    @Override
    public void eat(String food) {
        if (!food.equals("vegetable")) {
            System.out.println(super.getAnimalType() + " are not eating that type of food!");
            super.setFoodEaten(0);
        } else {
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.#");
        return "Zebra["
                + super.getAnimalName() + ", "
                + super.getAnimalType() + ", "
                + format.format(super.getAnimalWeight()) + ", "
                + super.getLivingRegion() + ", "
                + super.getFoodEaten() + "]";
    }
}
