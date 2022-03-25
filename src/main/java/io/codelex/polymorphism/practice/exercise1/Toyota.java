package io.codelex.polymorphism.practice.exercise1;

public class Toyota implements Car, CarBoost{
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 7;
    }

    public void slowDown() {
        currentSpeed -= 7;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 20;
    }
}
