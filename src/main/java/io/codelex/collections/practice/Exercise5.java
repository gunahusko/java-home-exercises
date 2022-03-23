package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = user.nextInt();

        if (isHappy(number)) {
            System.out.println("Integer is happy!");
        } else {
            System.out.println("Integer is unhappy!");
        }

        sumOfDigitsSquares(number);
    }

    private static boolean isHappy(int number) {
        boolean isHappy = false;

        int result = sumOfDigitsSquares(number);

        if (result > 10) {
            sumOfDigitsSquares(result);
        } else if (result == 1) {
            isHappy = true;
        }

        return isHappy;
    }

    private static int sumOfDigitsSquares(int number) {
        char[] digits = String.valueOf(number).toCharArray();
        int digitsLength = digits.length;

        int sumOfDigitsSquares = 0;
        for (char digit : digits) {
            sumOfDigitsSquares += (int) Math.pow((int) digit, digitsLength);
        }

        return sumOfDigitsSquares;
    }
}
