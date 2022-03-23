package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the numerator: ");
            int numerator = 0;

            try {
                numerator = scanner.nextInt();
                if (numerator == 0) {
                    System.out.println("Enter numerator > 0\n");
                }
            } catch (InputMismatchException e) {
                if (scanner.hasNextLine()) {
                    String answer = scanner.nextLine();
                    if (answer.equals("quit")) {
                        break;
                    }
                }
                System.out.println("You entered bad data.");
                System.out.println("Please try again.\n");
            }

            if (numerator > 0) {
                System.out.print("Enter the divisor: ");
                int divisor;

                try {
                    divisor = scanner.nextInt();
                    System.out.println(numerator + " / " + divisor + " = " + numerator / divisor + "\n");
                } catch (ArithmeticException e) {
                    System.out.println("You can't divide " + numerator + " by 0\n");
                }
            }
        }


    }
}
