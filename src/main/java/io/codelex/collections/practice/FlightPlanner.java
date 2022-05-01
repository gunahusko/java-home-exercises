package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset CHARSET = Charset.defaultCharset();
    private static final String FILE = "/collections/flights.txt";
    private static List<String> pairOfCities;
    private static final Set<String> cities = new HashSet<>();
    private static String userAnswer;
    private static String currentCity;
    private static String destinationCity;
    private static int key = 1;
    private static final Map<Integer, String> trip = new HashMap<>();

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(FILE).toURI());

        pairOfCities = Files.readAllLines(path, CHARSET);

        for (String pair : pairOfCities) {
            String[] splitPair = pair.split(" -> ");
            cities.addAll(Arrays.asList(splitPair));
        }

        System.out.println("What would you like to do: ");
        System.out.println("To display list of the cities press 1 ");
        System.out.println("To exit program press # ");
        System.out.print("> ");

        Scanner user = new Scanner(System.in);
        userAnswer = user.nextLine();

        if (userAnswer.equals("#")) {
            user.close();
        } else if (userAnswer.equals("1")) {
            selectFlight(user);
        }
    }

    private static void selectFlight(Scanner user) {
        System.out.println("To select a city from which you would like to start press 1 ");
        System.out.print("> ");
        userAnswer = user.nextLine();

        if (userAnswer.equals("1")) {
            String startFromCity = selectCity(user);
            currentCity = startFromCity;

            while (!startFromCity.equals(destinationCity)) {
                flightsFromSelectedCity();

                System.out.println("Select destination: ");
                destinationCity = selectCity(user);
                roundTripRouteMap();
                System.out.println();
            }

            System.out.println("Your round-trip route: ");
            System.out.println(trip);
        }
    }

    private static String selectCity(Scanner user) {
        ArrayList<String> selectedCities = new ArrayList<>(cities);

        for (int i = 0; i < selectedCities.size(); i++) {
            System.out.println(i + " " + selectedCities.get(i));
        }

        System.out.print("> ");
        userAnswer = user.nextLine();

        return selectedCities.get(Integer.parseInt(userAnswer));
    }

    private static void flightsFromSelectedCity() {
        for (String pair : pairOfCities) {
            if (pair.contains(currentCity)) {
                String[] pairSplit = pair.split(" -> ");
                if (pairSplit[0].equals(currentCity)) {
                    System.out.println(pair);
                }
            }
        }
        System.out.println();
    }

    private static void roundTripRouteMap() {
        for (String pair : pairOfCities) {
            String[] pairSplit = pair.split(" -> ");
            if (pairSplit[0].equals(currentCity) && pairSplit[1].equals(destinationCity)) {
                trip.put(key, " " + pair);
                key++;
                currentCity = pairSplit[1];
            }
        }
    }
}
