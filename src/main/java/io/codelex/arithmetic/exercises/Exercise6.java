package io.codelex.arithmetic.exercises;

public class Exercise6 {
    public static void main(String[] args) {
        CozaLozaWoza();
    }

    public static void CozaLozaWoza() {
        for (int i=1; i<=110; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("CozaLoza");
            } else if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.print("CozaWoza");
            } else if (i % 3 == 0) {
                System.out.print("Coza");
            } else if (i % 5 == 0) {
                System.out.print("Loza");
            } else if (i % 7 == 0) {
                System.out.print("Woza");
            } else {
                System.out.print(i);
            }

            System.out.print(" ");
            if (i % 11 == 0) System.out.println();
        }
    }
}