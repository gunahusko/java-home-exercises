package io.codelex.arrays.exercises;

import java.util.Scanner;

public class Exercise8 {

    private static final String[] WORDS = {
            "false", "true", "java", "return",
            "static", "public", "array", "void", "class"
    };
    private static int moveCounter;

    public static void main(String[] args) {
        hangMan();
    }

    public static void hangMan() {
        String userGuess = "";
        String userMissed = "";
        String randomWord = WORDS[(int) (Math.random() * WORDS.length)];
        moveCounter = randomWord.length() + 2;

        int i = 0;
        while (i < moveCounter) {
            printBoard(randomWord, userGuess, userMissed);
            Scanner in = new Scanner(System.in);
            String user = in.nextLine();

            if (randomWord.toLowerCase().contains(user.toLowerCase())) {
                if (!userGuess.toLowerCase().contains(user.toLowerCase())) {
                    userGuess += user;
                }
            } else {
                userMissed += user;
            }

            if (playerWon(randomWord, userGuess)) {
                System.out.println();
                System.out.print("Word: ");

                for (char chars : randomWord.toCharArray()) {
                    System.out.print(chars + " ");
                }

                System.out.println();
                System.out.println("YOU GOT IT!");
                break;
            }
            moveCounter--;
        }

        if (!playerWon(randomWord, userGuess)) {
            System.out.println();
            System.out.println("YOU LOSE!");
        }
        System.out.println();
        System.out.print("Play \"again\" or \"quit\"? ");
        Scanner userAnswer = new Scanner(System.in);
        String answer = userAnswer.nextLine();

        if (answer.equals("again")) {
            hangMan();
        }
        if (answer.equals("quit")) {
            userAnswer.close();
        }
    }

    public static void printBoard(String randomWord, String userGuess, String userMissed) {
        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Number of moves: ");
        System.out.println(moveCounter);
        System.out.print("Word: ");
        printWord(randomWord, userGuess);
        System.out.println("Misses: " + userMissed);
        System.out.print("Guess: ");
    }

    public static void printWord(String randomWord, String userGuess) {
        for (char chars : randomWord.toCharArray()) {
            if (userGuess.toLowerCase().contains(String.valueOf(chars).toLowerCase())) {
                System.out.print(chars + " ");
            } else {
                System.out.print("_" + " ");
            }
        }
        System.out.println();
    }

    public static boolean playerWon(String randomWord, String userGuess) {
        boolean won = true;
        for (char chars : randomWord.toCharArray()) {
            if (!userGuess.contains(String.valueOf(chars))) {
                won = false;
                break;
            }
        }
        return won;
    }
}



