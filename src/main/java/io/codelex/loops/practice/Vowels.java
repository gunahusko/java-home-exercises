package io.codelex.loops.practice;

public class Vowels {

    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) {
        exampleA();
        exampleB();
    }

    private static void exampleA() {
        System.out.println("Example: use for");
        for (int i = 0; i < VOWELS.length; i++) {
            System.out.println(VOWELS[i]);
        }
    }

    private static void exampleB() {
        System.out.println("Example: use foreach");
        for (char abc : VOWELS) {
            System.out.println(abc);
        }
    }

}
