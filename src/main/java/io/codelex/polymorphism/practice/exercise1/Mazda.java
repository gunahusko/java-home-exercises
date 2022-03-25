package io.codelex.polymorphism.practice.exercise1;

public class Mazda implements Car{
    private Integer currentSpeed = 0;

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void speedUp() {
        currentSpeed += 10;
    }

    public void slowDown() {
        currentSpeed -= 10;
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
}
