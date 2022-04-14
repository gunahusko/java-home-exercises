package io.codelex.exceptions.practice;

public class Exercise2 {
    public static void main(String[] args) {
        methodA(12, 0);
    }

    public static void methodA(int number1, int number2) throws ArithmeticException {
        try {
            methodB(number1, number2);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodB(int number1, int number2) throws ArithmeticException {
        try {
            methodC(number1, number2);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodC(int number1, int number2) throws ArithmeticException {
        try {
            int result = number1 / number2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
