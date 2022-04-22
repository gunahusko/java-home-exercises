package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private final String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
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
        return super.getAnimalType() + "["
                + super.getAnimalName() + ", "
                + breed + ", "
                + format.format(super.getAnimalWeight()) + ", "
                + super.getLivingRegion() + ", "
                + super.getFoodEaten() + "]";

    }
}
