package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;

        int sumOf1And100 = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sumOf1And100 += i;
        }
        double average = sumOf1And100 / 100d;

        System.out.println("The sum of 1 to 100 is " + sumOf1And100);
        System.out.println("The average is " + average);
    }
}
