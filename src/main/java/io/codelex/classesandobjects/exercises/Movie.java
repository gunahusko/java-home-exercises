package io.codelex.classesandobjects.exercises;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private final String title;
    private final String studio;
    private final String rating; // (i.e. PG13, R, etc)

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public String getRating() {
        return rating;
    }

    public static void getPG(Movie[] movies) {
        List<Movie> pgMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getRating().equals("PG")) {
                pgMovies.add(movie);
            }
        }
        for (Movie movie : pgMovies) {
            System.out.println(movie);
        }

    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
