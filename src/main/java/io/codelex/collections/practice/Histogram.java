package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        printHistogram(scores);
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static void printHistogram(String scores) {
        String[] splitScores = scores.split(" ");

        StringBuilder from00to09 = new StringBuilder();
        StringBuilder from10to19 = new StringBuilder();
        StringBuilder from20to29 = new StringBuilder();
        StringBuilder from30to39 = new StringBuilder();
        StringBuilder from40to49 = new StringBuilder();
        StringBuilder from50to59 = new StringBuilder();
        StringBuilder from60to69 = new StringBuilder();
        StringBuilder from70to79 = new StringBuilder();
        StringBuilder from80to89 = new StringBuilder();
        StringBuilder from90to99 = new StringBuilder();
        StringBuilder from100 = new StringBuilder();

        for (String number : splitScores) {
            int num = Integer.parseInt(number);
            if (num < 10) {
                from00to09.append("*");
            } else if (num < 20) {
                from10to19.append("*");
            } else if (num < 30) {
                from20to29.append("*");
            } else if (num < 40) {
                from30to39.append("*");
            } else if (num < 50) {
                from40to49.append("*");
            } else if (num < 60) {
                from50to59.append("*");
            } else if (num < 70) {
                from60to69.append("*");
            } else if (num < 80) {
                from70to79.append("*");
            } else if (num < 90) {
                from80to89.append("*");
            } else if (num < 100) {
                from90to99.append("*");
            } else {
                from100.append("*");
            }
        }

        System.out.println("00-09: " + from00to09);
        System.out.println("10-19: " + from10to19);
        System.out.println("20-29: " + from20to29);
        System.out.println("30-39: " + from30to39);
        System.out.println("40-49: " + from40to49);
        System.out.println("50-59: " + from50to59);
        System.out.println("60-69: " + from60to69);
        System.out.println("70-79: " + from70to79);
        System.out.println("80-89: " + from80to89);
        System.out.println("90-99: " + from90to99);
        System.out.println("100: " + from100);
    }
}
