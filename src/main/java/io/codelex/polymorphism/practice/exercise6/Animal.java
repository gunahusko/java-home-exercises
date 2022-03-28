package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    protected String animalName;
    protected String animalType;
    protected Double animalWeight;
    protected Integer foodEaten;

    public Animal(String animalType, String animalName, Double animalWeight, Integer foodEaten) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public abstract String toString();
    public abstract void makeSound();
    public abstract void eat(String food);
}
