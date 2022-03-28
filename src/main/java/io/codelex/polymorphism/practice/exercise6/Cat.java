package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private final String breed;

    public Cat(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowww");
    }

    @Override
    public void eat(String food) {
        System.out.println(this);
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.#");
        return animalType + "[" + animalName + ", " + breed + ", " + format.format(animalWeight) + ", " + livingRegion + ", " + foodEaten + "]";

    }
}
