package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal{
    protected String livingRegion;

    public Mammal(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }
}
