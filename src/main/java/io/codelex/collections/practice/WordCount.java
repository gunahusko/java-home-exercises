package io.codelex.collections.practice;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {
    private static final Charset CHARSET = Charset.defaultCharset();
    private static final String FILE = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(FILE).toURI());

        List<String> line = Files.readAllLines(path, CHARSET);

        BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(path)));

        String readAllText;
        int wordCount = 0;
        int characterCount = 0;

        while ((readAllText = reader.readLine()) != null) {
            if (!readAllText.equals("")) {
                characterCount += readAllText.length();

                String cleanText = readAllText.replaceAll("'", " ");

                String[] words = cleanText.split("\\s+");
                wordCount += words.length;
            }
        }

        System.out.println("Lines = " + line.size());
        System.out.println("Words = " + wordCount);
        System.out.println("Chars = " + characterCount);
    }
}
