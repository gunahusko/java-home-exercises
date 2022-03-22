package io.codelex.enums.practice;

import java.util.EnumMap;

public enum CardinalPoints {
    NORTH("North","up", 0),
    SOUTH("South","down", 1),
    EAST("East","right", 2),
    WEST("West","left", 3);

    private final String name;
    private final String direction;
    private final int point;

    CardinalPoints(String name, String direction, int point) {
        this.name = name;
        this.direction = direction;
        this.point = point;
    }

    public static void printUot(int point) {
        switch (point) {
            case 0:
                System.out.printf("%-10s %-5s\n", NORTH.name, NORTH.direction);
                break;
            case 1:
                System.out.printf("%-10s %-5s\n", SOUTH.name, SOUTH.direction);
                break;
            case 2:
                System.out.printf("%-10s %-5s\n", EAST.name, EAST.direction);
                break;
            case 3:
                System.out.printf("%-10s %-5s\n", WEST.name, WEST.direction);
                break;
        }
    }

    @Override
    public String toString() {
        return name + ":" + direction + ":" + point;
    }
}
