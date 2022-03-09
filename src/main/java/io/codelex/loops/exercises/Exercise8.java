package io.codelex.loops.exercises;

public class Exercise8 {

    private static final int ONE_BLOCK_LENGTH = 4;

    public static void main(String[] args) {
        asciiFigure(5);
        asciiFigure(3);
        asciiFigure(7);

        System.out.println("_______________asciiFigureB");
        System.out.println();

        asciiFigureB(5);
        asciiFigureB(3);
        asciiFigureB(7);
    }

    private static void asciiFigure(int num) {

        for (int i = 1; i <= num; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 1; j <= (num - i) * ONE_BLOCK_LENGTH; j++) {
                str.append("/");
            }
            for (int k = 0; k < ((i - 1) * ONE_BLOCK_LENGTH * 2); k++) {
                str.append("*");
            }
            for (int l = 1; l <= (num - i) * ONE_BLOCK_LENGTH; l++) {
                str.append("\\");
            }
            System.out.println(str);
        }
        System.out.println();
    }

    private static void asciiFigureB(int num) {
        String str;

        for (int i = 1; i <= num; i++) {
            str = "/".repeat((num - i) * ONE_BLOCK_LENGTH);
            str += "*".repeat((i - 1) * ONE_BLOCK_LENGTH * 2);
            str += "\\".repeat((num - i) * ONE_BLOCK_LENGTH);
            System.out.println(str);
        }

        System.out.println();
    }
}
