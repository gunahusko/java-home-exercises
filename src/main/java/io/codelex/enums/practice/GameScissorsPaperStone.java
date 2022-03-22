package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class GameScissorsPaperStone {
    static int countTrials = 0;
    static int computerWon = 0;
    static int youWon = 0;
    static ScissorsPaperStone yourChoice;
    static ScissorsPaperStone computerChoice;

    public static void main(String[] args) {
        System.out.println("Let us begin...");
        beginGame();
    }

    private static void beginGame() {
        System.out.println("Scissor-Paper-Stone");
        yourTurn();
    }

    private static void yourTurn() {
        System.out.print("\tYour turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine().toLowerCase();

        switch (choice) {
            case "q":
                System.out.println();
                System.out.printf("Number of trials: %d\n", countTrials);
                System.out.printf("I won %d(%.2f%s). ", computerWon, (double)(computerWon * 100 / countTrials), "%");
                System.out.printf("You won %d(%.2f%s).\n", youWon, (double)(youWon * 100 / countTrials), "%");
                System.out.println("Bye!");
                break;
            case "s":
                yourChoice = ScissorsPaperStone.SCISSORS;
                computerTurn();
                break;
            case "p":
                yourChoice = ScissorsPaperStone.PAPER;
                computerTurn();
                break;
            case "t":
                yourChoice = ScissorsPaperStone.STONE;
                computerTurn();
                break;
            default:
                System.out.println("\tInvalid input, try again...");
                yourTurn();
        }
    }

    private static void computerTurn() {
        System.out.print("\tMy turn: " + randomChoice());
        System.out.println();

        resultOfWinner();
        countTrials++;

        System.out.println();
        beginGame();
    }

    private static ScissorsPaperStone randomChoice() {
        computerChoice = ScissorsPaperStone.class.getEnumConstants()[new Random().nextInt(ScissorsPaperStone.class.getEnumConstants().length)];
        return computerChoice;
    }

    private static void resultOfWinner() {
        if (yourChoice.equals(computerChoice)) {
            System.out.println("\tTie!");
        }

        if (yourChoice.equals(ScissorsPaperStone.SCISSORS) && computerChoice.equals(ScissorsPaperStone.STONE)) {
            System.out.println("\tStone breaks scissors, I won!");
            computerWon++;
        } else if(yourChoice.equals(ScissorsPaperStone.PAPER) && computerChoice.equals(ScissorsPaperStone.SCISSORS)) {
            System.out.println("\tScissors cuts paper, I won!");
            computerWon++;
        } else if(yourChoice.equals(ScissorsPaperStone.STONE) && computerChoice.equals(ScissorsPaperStone.PAPER)) {
            System.out.println("\tPaper wrap stone, I won!");
            computerWon++;
        }

        if ((yourChoice.equals(ScissorsPaperStone.SCISSORS) && computerChoice.equals(ScissorsPaperStone.PAPER)) ||
            (yourChoice.equals(ScissorsPaperStone.PAPER) && computerChoice.equals(ScissorsPaperStone.STONE)) ||
            (yourChoice.equals(ScissorsPaperStone.STONE) && computerChoice.equals(ScissorsPaperStone.SCISSORS))) {
            System.out.println("\tYou won!");
            youWon++;
        }
    }
}
