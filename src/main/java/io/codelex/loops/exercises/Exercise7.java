package io.codelex.loops.exercises;
import java.util.Random;
import java.util.Scanner;

public class Exercise7 {

    private static int points = 0;

    public static void main(String[] args) {
        piglet();
    }

    private static void piglet() {
        System.out.println("Welcome to Piglet!");
        countPoints();
    }

    private static void countPoints() {
        Random random = new Random();
        int dice = random.nextInt(6);

        if (dice < 1) {
            dice = random.nextInt(6);
        } else if (dice == 1) {
            System.out.println("You got 0 points.");
        } else {
            System.out.println("You rolled a " + dice + "!");
            points += dice;
            readBoolean();
        }
    }

    private static void readBoolean() {
        System.out.print("Roll again? ");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine().toLowerCase();

        if (answer.equals("yes") || answer.equals("y")) {
            countPoints();
        } else {
            System.out.println("You got " + points + " points.");
        }
    }
}
