package io.codelex.classesandobjects.exercises;

public class VideoStore {
    public static Video[] inStock = new Video[10];

    public static void addNewVideo(String movieName, int rating) {
        for (int i = 0; i < inStock.length; i++) {
            if (inStock[i] == null) {
                inStock[i] = new Video(movieName, rating);
                System.out.println("The video is added to store.");
                System.out.println("Videos in stock: ");
                printInStockInventory();
                break;
            }
        }
    }

    public static void rentVideo(String movieName) {
        for (Video video : inStock) {
            if (video.checkOut(movieName)) {
                video.setAvailable(false);
                System.out.println("You rented " + video.getTitle());
                printInStockInventory();
                break;
            }
        }
    }

    public static void returnVideo(String movieName) {
        for (Video video : inStock) {
            if (video.checkOut(movieName)) {
                video.setAvailable(true);
                System.out.println(video.getTitle() + " returned successfully.");
                break;
            }
        }

    }

    public static void printInStockInventory() {
        System.out.println("Videos in stock: ");
        for (Video v : VideoStore.inStock) {
            System.out.println(v);
        }
        System.out.println("_________________________");
    }

}
