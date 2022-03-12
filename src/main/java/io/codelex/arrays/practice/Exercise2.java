package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number");
        int maxNumber = input.nextInt();

        int[] myArray = new int[maxNumber-minNumber+1];

        for (int i=0; i<myArray.length; i++) {
            myArray[i] = minNumber + i;
        }

        int sum = 0;
        for (int x : myArray) {
            sum += x;
        }

        System.out.println("The sum of " + Arrays.toString(myArray) + " is " + sum);
    }
}
