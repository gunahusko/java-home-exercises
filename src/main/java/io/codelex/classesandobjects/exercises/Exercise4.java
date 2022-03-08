package io.codelex.classesandobjects.exercises;

public class Exercise4 {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];

        movies[0] = new Movie("Casino Royale", "Eon Productions", "PG13");
        movies[1] = new Movie("Glass", "Buena Vista International", "PG13");
        movies[2] = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");

        Movie.getPG(movies);
    }
}

