package io.codelex.polymorphism.practice.exercise1;

public class Toyota implements Car, CarBoost {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 7;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 7;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 20;
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
}
