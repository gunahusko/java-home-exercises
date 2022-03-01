package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        NumberSquare();
    }

    public static void NumberSquare() {
        Scanner in = new Scanner(System.in);
        System.out.print("Min? ");
        int min = in.nextInt();
        System.out.print("Max? ");
        int max = in.nextInt();

        for(int i=0; i<max; i++) {
            String line = "";
                for (int j=min; j<=max; j++) {
                    if (j+i <= max) {
                        line += j+i;
                    } else {
                        line += (j+i)-max;
                    }
                }
            System.out.println(line);
        }
    }
}
