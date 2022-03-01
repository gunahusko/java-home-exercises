package io.codelex.typesandvariables.practice;

public class Casting {
    public static void main(String[] args) {
        first();
        second();
    }

    private static void first() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        int sum = a + b + c + d + e;
        System.out.println(sum);
    }

    private static void second() {
        int a = 1;
        int b = 2;
        int c = 3;
        float d = 4.2f;
        float e = 5.3f;

        float sum = a + b + c + d + e;
        System.out.println(sum);
    }
}
