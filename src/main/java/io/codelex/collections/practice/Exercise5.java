package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {
    private static final int SQUARE_NUMBER = 2;

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = user.nextInt();

        isHappy(number);
    }

    private static void isHappy(int number) {
        int result = sumOfDigitsSquares(number);

        while (result > 10) {
            result = sumOfDigitsSquares(result);
        }

        if (result == 1) {
            System.out.println("Integer is happy!");
        } else {
            System.out.println("Integer is unhappy!");
        }
    }

    private static int sumOfDigitsSquares(int number) {
        String[] digits = String.valueOf(number).split("");

        int sumOfDigitsSquares = 0;
        for (String digit : digits) {
            sumOfDigitsSquares += (int) Math.pow(Integer.parseInt(digit), SQUARE_NUMBER);
        }

        return sumOfDigitsSquares;
    }
}
