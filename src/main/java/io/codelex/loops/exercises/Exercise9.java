package io.codelex.loops.exercises;
import java.util.Random;
import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
        rollTwoDice();
    }

    private static void rollTwoDice() {
        Scanner in = new Scanner(System.in);
        System.out.print("Desired sum: ");
        int num = in.nextInt();

        int sum = 0;
        while (sum != num) {
            Random random = new Random();
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
                sum = dice1 + dice2;
                System.out.println(dice1 + " and " + dice2 + " = " + sum);
        }
    }
}
