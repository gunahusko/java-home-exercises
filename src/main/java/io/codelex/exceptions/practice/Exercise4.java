package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        try {
            double d = getInput();
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        } catch (IllegalArgumentException e) {
        System.out.println("Result will be imaginary number.");
        }
    }

    static double getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double d = Double.parseDouble(in.nextLine());
        if (d < 0) {
            throw new IllegalArgumentException("Number is negative");
        }
        return d;
    }
}
