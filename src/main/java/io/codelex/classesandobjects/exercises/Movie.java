package io.codelex.classesandobjects.exercises;

import java.util.Arrays;

public class Movie {
    private final String TITLE;
    private final String STUDIO;
    private final String RATING; // (i.e. PG13, R, etc)

    public Movie(String title, String studio, String rating) {
        this.TITLE = title;
        this.STUDIO = studio;
        this.RATING = rating;
    }

    public Movie(String title, String studio) {
        this.TITLE = title;
        this.STUDIO = studio;
        this.RATING = "PG";
    }

    public String getRATING() {
        return this.RATING;
    }

    public static void getPG(Movie[] movies) {
        Movie[] pgMovies = new Movie[1];
        for (Movie movie : movies) {
            if (movie.getRATING().equals("PG")) {
                pgMovies[0] = movie;
            }
        }
        System.out.println(Arrays.toString(pgMovies));
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + TITLE + '\'' +
                ", studio='" + STUDIO + '\'' +
                ", rating='" + RATING + '\'' +
                '}';
    }
}
