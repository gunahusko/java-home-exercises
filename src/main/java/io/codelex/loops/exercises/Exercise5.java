package io.codelex.loops.exercises;
import java.util.Scanner;

public class Exercise5 {

    private static final int  TOTAL_LINE_LENGTH = 30;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first word:");
        String firstWord = userInput.nextLine();
        System.out.println("Enter second word:");
        String secondWord = userInput.nextLine();

        int dotLength = TOTAL_LINE_LENGTH - firstWord.length() - secondWord.length();
        System.out.print(firstWord);

        for (int i = 0; i < dotLength; i++) {
            System.out.print(".");
        }
        System.out.println(secondWord);
    }
}
