package io.codelex.enums.practice;

public class testCardinalPoints{
    public static void main(String[] args) {

        System.out.printf("%-10s %-5s\n", "Direction", "Text");
        CardinalPoints.printUot(CardinalPoints.NORTH.ordinal());
        CardinalPoints.printUot(CardinalPoints.SOUTH.ordinal());
        CardinalPoints.printUot(CardinalPoints.EAST.ordinal());
        CardinalPoints.printUot(CardinalPoints.WEST.ordinal());
        System.out.println();

        System.out.println(CardinalPoints.NORTH);
        System.out.println(CardinalPoints.SOUTH);
        System.out.println(CardinalPoints.EAST);
        System.out.println(CardinalPoints.WEST);
    }
}
