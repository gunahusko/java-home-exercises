package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        findLargest(num1, num2, num3);
    }

    public static void findLargest(int num1, int num2, int num3) {
        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        } else if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest of three numbers: " + largest);
    }

}
