package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String userSentenceInput = input.nextLine();

        int countUppercaseLetters = 0;

        for (int i=0; i<userSentenceInput.length(); i++) {
            if (userSentenceInput.charAt(i) >= 65 && userSentenceInput.charAt(i) <=90) {
                countUppercaseLetters++;
            }
        }

        System.out.println("In this sentence is " + countUppercaseLetters + " uppercase letters.");
    }
}
