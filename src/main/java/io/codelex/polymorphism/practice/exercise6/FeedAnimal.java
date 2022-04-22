package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FeedAnimal {

    private static final List<Object> animals = new ArrayList<>();

    public static void main(String[] args) {
        animalInfo();
    }

    private static void animalInfo() {
        Scanner userInput = new Scanner(System.in);
        String userAnswer = userInput.nextLine();
        String[] infoAboutAnAnimal = userAnswer.split(" ");

        if (!infoAboutAnAnimal[0].equalsIgnoreCase("end")) {
            feedAnimals(infoAboutAnAnimal, userInput);
        } else {
            userInput.close();
            System.out.print("> ");
            System.out.println(animals);
        }
    }

    private static void feedAnimals(String[] infoAboutAnAnimal, Scanner userInput) {
        System.out.print("> ");
        Animal animal = null;

        if (infoAboutAnAnimal[0].equalsIgnoreCase("cat")) {
            animal = new Cat(infoAboutAnAnimal[0], infoAboutAnAnimal[1], Double.parseDouble(infoAboutAnAnimal[2]), infoAboutAnAnimal[3], infoAboutAnAnimal[4]);
        }
        if (infoAboutAnAnimal[0].equalsIgnoreCase("tiger")) {
            animal = new Tiger(infoAboutAnAnimal[0], infoAboutAnAnimal[1], Double.parseDouble(infoAboutAnAnimal[2]), infoAboutAnAnimal[3]);
        }
        if (infoAboutAnAnimal[0].equalsIgnoreCase("zebra")) {
            animal = new Zebra(infoAboutAnAnimal[0], infoAboutAnAnimal[1], Double.parseDouble(infoAboutAnAnimal[2]), infoAboutAnAnimal[3]);
        }
        if (infoAboutAnAnimal[0].equalsIgnoreCase("mouse")) {
            animal = new Mouse(infoAboutAnAnimal[0], infoAboutAnAnimal[1], Double.parseDouble(infoAboutAnAnimal[2]), infoAboutAnAnimal[3]);
        }

        if (animal != null) {
            animals.add(animal);
            animal.makeSound();

            String food = userInput.nextLine();
            String[] splitFoodInfo = food.split(" ");

            animal.setFoodEaten(Integer.valueOf(splitFoodInfo[1]));
            System.out.print("> ");
            animal.eat(splitFoodInfo[0].toLowerCase());
            animalInfo();
        }
    }

}
