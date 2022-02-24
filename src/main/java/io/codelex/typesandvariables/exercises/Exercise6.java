package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter five numbers:");
        int sumOfInputNum = 0;
        int countInput = 0;

        for (int i=0; i<5; i++) {
            sumOfInputNum += input.nextInt();
            countInput++;
        }
        input.close();
        System.out.println("Sum of " + countInput + " numbers: " + sumOfInputNum);
    }
}
