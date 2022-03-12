package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise4 {

    // Write a Java program to test if an array contains a specific value.
    public static void main(String[] args) {
        int[] myArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };

        // check if contains number 1245
        for (int number : myArray) {
            String[] numString = Integer.toString(number).split(""); // [1, 2, 5, 4]
            Arrays.sort(numString); // [1, 2, 4, 5]
            String sorted = String.join("", numString); // "1245"

            if (sorted.equals("1245")) {
                System.out.println("Contains!");
            }
        }

            /*
            tavs labojums:
            if (number == 1245) {
                System.out.println("Contains!");
            }

            vecā versija:
            String num = Integer.toString(number); // int 1254 to String
            char[] digitChar = num.toCharArray(); // string to char [1, 2, 5, 4]
            Arrays.sort(digitChar); // sort 1245

            if (Integer.parseInt(String.valueOf(digitChar)) == 1245) System.out.println("Contains!"); */


    }
}
