package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        System.out.print("> ");
        int usersNumber = input.nextInt();
        input.close();

        int myNumber = (int) (Math.random() * 100);

        if (usersNumber == myNumber) {
            System.out.println("You guessed it!  What are the odds?!?");
        } else if (usersNumber > myNumber){
            System.out.println("Sorry, you are too high. I was thinking of " + myNumber + ".");
        } else {
            System.out.println("Sorry, you are too low. I was thinking of " + myNumber + ".");
        }
    }

}
