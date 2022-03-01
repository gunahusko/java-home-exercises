package io.codelex.loops.exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        RollTwoDice();
    }

    public static void RollTwoDice() {
        Scanner in = new Scanner(System.in);
        System.out.print("Desired sum: ");
        int num = in.nextInt();

        boolean isEqualsNum = true;
        while(isEqualsNum) {
            int max = 6;
            int min = 1;
            int range = max - min + 1;
            int dice1 = (int) (Math.random() * range) + min;
            int dice2 = (int) (Math.random() * range) + min;
            int sum = dice1 + dice2;

            System.out.println(dice1 + " and " + dice2 + " = " + sum);
            if (sum == num) isEqualsNum = false;
        }
    }
}
