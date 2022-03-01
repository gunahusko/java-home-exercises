package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise7 {
    static int points = 0;
    static int dice = 0;

    public static void main(String[] args) {
        Piglet();
    }

    public static void Piglet() {
        System.out.println("Welcome to Piglet!");
        CountPoints();
    }

    public static void CountPoints() {
        int max = 6;
        int min = 1;
        int range = max - min + 1;

        dice = (int)(Math.random() * range) + min;
        points += dice;
        System.out.println("You rolled a " + dice + "!");

        if (dice == 1) {
            System.out.println("You got 0 points.");
        } else if (dice > 1) {
            readBoolean();
        }
    }

    public static void readBoolean() {
        System.out.print("Roll again? ");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine().toLowerCase();

        if(answer.equals("yes")) {
            CountPoints();
        } else if (answer.equals("y")) {
            CountPoints();
        } else {
            System.out.println("You got " + points + " points.");
        }
    }
}
