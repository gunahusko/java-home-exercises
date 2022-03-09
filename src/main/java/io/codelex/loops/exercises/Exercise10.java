package io.codelex.loops.exercises;
import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        numberSquare();
    }

    private static void numberSquare() {
        Scanner in = new Scanner(System.in);
        System.out.print("Min? ");
        int min = in.nextInt();
        System.out.print("Max? ");
        int max = in.nextInt();

        for(int i=0; i<max; i++) {
            StringBuilder line = new StringBuilder();
                for (int j=min; j<=max; j++) {
                    if (j+i <= max) {
                        line.append(j + i);
                    } else {
                        line.append((j + i) - max);
                    }
                }
            System.out.println(line);
        }
    }
}
