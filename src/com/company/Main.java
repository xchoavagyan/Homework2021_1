package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Movie nominatedMovie1 = new Movie("Fast and Furious",random.nextInt(10)+1);
        Movie nominatedMovie2 = new Movie("Bohemian Rhapsody",random.nextInt(10)+1);
        Movie nominatedMovie3 = new Movie("1+1",random.nextInt(10)+1);
        Movie nominatedMovie4 = new Movie("2+1",random.nextInt(10)+1);
        Movie nominatedMovie5 = new Movie("Shooter Island",random.nextInt(10)+1);
        Movie nominatedMovie6 = new Movie("Coming 2 America",random.nextInt(10)+1);
        Movie nominatedMovie7 = new Movie("Green Book",random.nextInt(10)+1);
        Movie nominatedMovie8 = new Movie("Tenet",random.nextInt(10)+1);
        Movie nominatedMovie9 = new Movie("Lion King",random.nextInt(10)+1);
        Movie nominatedMovie10 = new Movie("Joker",random.nextInt(10)+1);
        Movie[] movies = new Movie[10];
        movies[0] = nominatedMovie1;
        movies[1] = nominatedMovie2;
        movies[2] = nominatedMovie3;
        movies[3] = nominatedMovie4;
        movies[4] = nominatedMovie5;
        movies[5] = nominatedMovie6;
        movies[6] = nominatedMovie7;
        movies[7] = nominatedMovie8;
        movies[8] = nominatedMovie9;
        movies[9] = nominatedMovie10;


        int maxRating = movies[0].getRating();
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating() >= maxRating) {
                maxRating = movies[i].getRating();
            }
        }

        for (int i = 0; i < movies.length; i++) {
            if (maxRating == movies[i].getRating()) {
                System.out.println("Օscar gets the movie : " + movies[i].getTitle());
            }
        }

    }
}
