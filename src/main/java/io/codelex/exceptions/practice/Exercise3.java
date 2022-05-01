package io.codelex.exceptions.practice;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {
    public static void cat(File file) throws IOException {

        RandomAccessFile input = null;
        String line;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            if (input != null) {
                input.close();
            }
        }

    }
}
