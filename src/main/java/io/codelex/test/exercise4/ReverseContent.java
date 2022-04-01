package io.codelex.test.exercise4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReverseContent {

    public static void main(String[] args) throws IOException {
        try {
            FileReader fileReader = new FileReader("src/main/java/io/codelex/test/exercise4/text.txt");
            FileWriter fileWriter = new FileWriter("src/main/java/io/codelex/test/exercise4/textReverse.txt");

            StringBuilder string = new StringBuilder();
            int i;

            while ((i = fileReader.read()) != -1) {
                string.append((char) i);
            }
            System.out.println(string + "\n");

            StringBuilder reversedString = string.reverse();
            System.out.println(reversedString);

            fileWriter.write(reversedString.toString());

            fileReader.close();
            fileWriter.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
