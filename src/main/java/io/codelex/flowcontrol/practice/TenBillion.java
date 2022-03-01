package io.codelex.flowcontrol.practice;

import java.lang.reflect.Field;
import java.util.Scanner;

public class TenBillion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        boolean isLong = in.hasNextLong();

        if (isLong) {
            long n = in.nextLong();
            if (n < 0) {
                n *= -1;
            }

            if (n >= 10_000_000_000L) {
                System.out.println("Number is greater or equals 10,000,000,000!");
            } else {
                int digits;
                if (n < 100L) {
                    digits = 2;
                } else if (n < 1_000L) {
                    digits = 3;
                } else if (n < 10_000L) {
                    digits = 4;
                } else if (n < 100_000L) {
                    digits = 5;
                } else if (n < 1_000_000L) {
                    digits = 6;
                } else if (n < 10_000_000L) {
                    digits = 7;
                } else if (n < 100_000_000L) {
                    digits = 8;
                } else if (n < 1_000_000_000L) {
                    digits = 9;
                } else {
                    digits = 10;
                }
                System.out.println("Number of digits in the number: " + digits);
            }
        } else {
            System.out.println("The number is not a long");
        }

    }

}
