package io.codelex.flowcontrol.exercises;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        printDayInWord();
    }

    private static void printDayInWord() {
        System.out.println("Enter number from 0-6 to print a day (0-Sunday, 1-Monday, 2-Tuesday...): ");
        Scanner in = new Scanner(System.in);
        int dayNumber = in.nextInt();

        switch (dayNumber) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid day");
        }

    }


}
