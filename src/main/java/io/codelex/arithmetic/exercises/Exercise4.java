package io.codelex.arithmetic.exercises;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(Product1ToN());
    }

    public static int Product1ToN() {
        int sumOfnumbers = 1;

        for(int i=2; i<=10; i++) {
            sumOfnumbers *= i;
        }
        return sumOfnumbers;
    }
}
