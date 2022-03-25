package io.codelex.enums.practice;

import java.util.Random;

public enum ScissorsPaperStone {
    SCISSORS, STONE, PAPER;

    public static ScissorsPaperStone randomMove() {
        Random random = new Random();
        ScissorsPaperStone[] values = ScissorsPaperStone.values();
        return values[random.nextInt(values.length)];
    }

}
