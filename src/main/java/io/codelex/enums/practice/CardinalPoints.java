package io.codelex.enums.practice;

public enum CardinalPoints {
    NORTH("North","up"),
    SOUTH("South","down"),
    EAST("East","right"),
    WEST("West","left");

    private final String name;
    private final String direction;

    CardinalPoints(String name, String direction) {
        this.name = name;
        this.direction = direction;
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
        return name + ":" + direction + ":" + ordinal();
    }
}
