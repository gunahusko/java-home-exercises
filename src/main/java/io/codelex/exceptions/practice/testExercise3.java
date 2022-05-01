package io.codelex.exceptions.practice;

import java.io.File;
import java.io.IOException;

public class testExercise3 {
    public static void main(String[] args) throws IOException {
        Exercise3.cat(new File("file.txt"));
    }
}
