package io.codelex.classesandobjects.exercises;

public class Video {
    private final String TITLE;
    private Boolean available = true;
    private int rating;

    public Video(String title, int rating) {
        this.TITLE = title;
        this.rating = rating;
    }

    public boolean checkOut(String title){
        return this.TITLE.toLowerCase().equals(title);
    }

    public Boolean getAvailable() {
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

    public String getTITLE() {
        return TITLE;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Video [" +
                "title = '" + TITLE + '\'' +
                ", available = " + available +
                ", rating = " + rating +
                ']';
    }
}

