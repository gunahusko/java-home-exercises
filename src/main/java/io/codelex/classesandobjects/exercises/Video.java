package io.codelex.classesandobjects.exercises;

public class Video {
    private final String title;
    private Boolean available = true;
    private int rating;

    public Video(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public boolean checkOut(String title){
        return this.title.toLowerCase().equals(title);
    }

    public Boolean isAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public void setRating(int rating) {
        int countRatings = 1;
        ++countRatings;
        this.rating = (this.rating + rating) / countRatings;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Video [" +
                "title = '" + title + '\'' +
                ", available = " + available +
                ", rating = " + rating +
                ']';
    }
}

