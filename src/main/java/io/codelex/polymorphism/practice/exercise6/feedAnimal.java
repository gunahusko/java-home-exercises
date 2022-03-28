package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class feedAnimal {

    private static final List<Object> fedAnimals = new ArrayList<>();

    public static void main(String[] args) {
        animalInfo();
    }

    private static void animalInfo() {
        Scanner userInput = new Scanner(System.in);
        String userAnswer = userInput.nextLine();
        String[] splitInfo = userAnswer.split(" ");

        if (!splitInfo[0].equalsIgnoreCase("end")) {
            feedAnimals(splitInfo, userInput);
        } else {
            userInput.close();

            System.out.print("> ");
            System.out.println(fedAnimals);
        }
    }

    private static void feedAnimals(String[] splitInfo, Scanner userInput) {
        System.out.print("> ");
        Animal animal = null;

        if (splitInfo[0].equalsIgnoreCase("cat")) {
            animal = new Cat(splitInfo[0], splitInfo[1], Double.parseDouble(splitInfo[2]), 0, splitInfo[3], splitInfo[4]);
        }
        if (splitInfo[0].equalsIgnoreCase("tiger")) {
            animal = new Tiger(splitInfo[0], splitInfo[1], Double.parseDouble(splitInfo[2]), 0, splitInfo[3]);
        }
        if (splitInfo[0].equalsIgnoreCase("zebra")) {
            animal = new Zebra(splitInfo[0], splitInfo[1], Double.parseDouble(splitInfo[2]), 0, splitInfo[3]);
        }
        if (splitInfo[0].equalsIgnoreCase("mouse")) {
            animal = new Mouse(splitInfo[0], splitInfo[1], Double.parseDouble(splitInfo[2]), 0, splitInfo[3]);
        }

        fedAnimals.add(animal);
        assert animal != null;
        animal.makeSound();

        String food = userInput.nextLine();
        String[] splitFoodInfo = food.split(" ");

        animal.foodEaten = Integer.valueOf(splitFoodInfo[1]);
        System.out.print("> ");
        animal.eat(splitFoodInfo[0].toLowerCase());
        animalInfo();
    }

}
