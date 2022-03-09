package io.codelex.loops.exercises;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        fizzBuzz();
    }

    private static void fizzBuzz() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter positive integer: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.print("Fizz");
                } else if (i % 5 == 0) {
                    System.out.print("Buzz");
                } else {
                    System.out.print(i);
                }

                System.out.print(" ");
                if (i % 20 == 0) System.out.println();
        }
    }
}
