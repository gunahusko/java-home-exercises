package io.codelex.enums.practice;

public class testCardinalPoints{
    public static void main(String[] args) {

        System.out.printf("%-10s %-5s\n", "Direction", "Text");
        CardinalPoints.printUot(0);
        CardinalPoints.printUot(1);
        CardinalPoints.printUot(2);
        CardinalPoints.printUot(3);
        System.out.println();

        System.out.println(CardinalPoints.NORTH);
        System.out.println(CardinalPoints.SOUTH);
        System.out.println(CardinalPoints.EAST);
        System.out.println(CardinalPoints.WEST);
    }
}
