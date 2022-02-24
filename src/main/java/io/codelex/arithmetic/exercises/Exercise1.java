package io.codelex.arithmetic.exercises;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(ifTheEitherOneIs15(5, 8));
        System.out.println(ifTheEitherOneIs15(15, 8));
        System.out.println(ifTheEitherOneIs15(6, 15));
        System.out.println(ifTheEitherOneIs15(5, 10));
        System.out.println(ifTheEitherOneIs15(25, 10));
    }

    public static boolean ifTheEitherOneIs15(int x, int y) {
        return ((x + y) == 15 || x == 15 || y == 15 || (x-y) == 15 || (y-x) == 15);
    }
}
