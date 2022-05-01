package io.codelex.polymorphism.practice.exercise1;

public class Mazda implements Car {
    private Integer currentSpeed = 0;

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void speedUp() {
        currentSpeed += 10;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 10;
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
}
