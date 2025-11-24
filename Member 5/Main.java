package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        MovieFileParser parser = new MovieFileParser();

        try {
            List<Movie> movies = parser.readMovies("movies.txt");

            System.out.println("Movies parsed successfully:");
            for (Movie m : movies) {
                System.out.println(m.getTitle() + " (" + m.getId() + ")");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
