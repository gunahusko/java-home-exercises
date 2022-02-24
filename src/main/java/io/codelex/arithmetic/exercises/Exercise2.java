package io.codelex.arithmetic.exercises;

public class Exercise2 {
    public static void main(String[] args) {
        CheckOddEven(3);
        CheckOddEven(4);
    }

    public static void CheckOddEven(int num) {
        if(num % 2 != 0) System.out.println("Odd number");
        if(num % 2 == 0) System.out.println("Even number");
        System.out.println("bye!");
    }
}
