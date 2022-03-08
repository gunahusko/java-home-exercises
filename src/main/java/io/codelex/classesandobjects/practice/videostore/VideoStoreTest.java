package io.codelex.classesandobjects.practice.videostore;
import io.codelex.classesandobjects.exercises.Video;
import io.codelex.classesandobjects.exercises.VideoStore;
import java.util.Scanner;

import static io.codelex.classesandobjects.exercises.VideoStore.printInStockInventory;

public class VideoStoreTest {

    //private static final int COUNT_OF_MOVIES = 3;  If I want store only one, it's not ok.

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT ");
            System.out.println("Choose 1 to fill video store ");
            System.out.println("Choose 2 to rent video (as user) ");
            System.out.println("Choose 3 to return video (as user) ");
            System.out.println("Choose 4 to print whole inventory of videos (as user) ");

            int n = keyboard.nextInt();
            keyboard.nextLine(); // after nextInt clean terminal

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    printInStockInventory();
                    break;
                default:
                    break;
            }
        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter movie name ");
            String movieName = scanner.nextLine();
            System.out.println("Enter rating ");
            int rating = scanner.nextInt();
            scanner.nextLine(); // after nextInt clean terminal
            VideoStore.addNewVideo(movieName, rating);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter movie name ");
        String movieName = scanner.nextLine().toLowerCase();

        for (Video video : VideoStore.inStock) {
            if (video.checkOut(movieName)) {
                if (video.getAvailable().equals(false)) {
                    System.out.println("Already rented. Please choose another.");
                    printInStockInventory();
                    System.out.println();
                    menu();

                } else if (video.getAvailable().equals(true)) {
                    System.out.println(video);
                    System.out.println("Enter YES to rent or CANCEL ");
                    String answer = scanner.nextLine().toUpperCase();

                    if (answer.equals("YES")) {
                        VideoStore.rentVideo(movieName);
                        System.out.println();
                        menu();
                    } else {
                        menu();
                    }
                }
            }
        }
        System.out.println("Wrong video name!");
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter movie name ");
        String movieName = scanner.nextLine().toLowerCase();

        for (Video video : VideoStore.inStock) {
            if (video.checkOut(movieName) && video.getAvailable().equals(false)) {
                System.out.println("Enter YES to return or CANCEL: ");
                String answer = scanner.nextLine().toUpperCase();

                if (answer.equals("YES")) {
                    VideoStore.returnVideo(movieName);
                    System.out.println("Enter rating: ");
                    int rating = scanner.nextInt();
                    scanner.nextLine(); // after nextInt clean terminal

                    video.setRating(rating);
                    System.out.println("Thank you! " + video.getTITLE() + " Total rating: " + video.getRating());
                    System.out.println();
                    menu();
                } else {
                    menu();
                }
            }
        }
    }

}
