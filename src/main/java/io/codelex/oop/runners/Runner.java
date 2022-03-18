package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(8, 12),
    INTERMEDIATE(5, 7),
    ADVANCED(2, 4);

    private final int min;
    private final int max;

    Runner(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static void getFitnessLevel(int runTime) {
        if (runTime <= ADVANCED.max && runTime >= ADVANCED.min) {
            System.out.println(ADVANCED);
        } else if (runTime >= INTERMEDIATE.min && runTime <= INTERMEDIATE.max) {
            System.out.println(INTERMEDIATE);
        } else if (runTime >= BEGINNER.min && runTime <= BEGINNER.max) {
            System.out.println(BEGINNER);
        }
    }
}
