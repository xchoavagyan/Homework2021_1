package com.company;

public class Movie {
//    8
//Design a class named Movie
//    properties
//        - title
//        - rating
//Create 10 movie objects in main, give them titles and random ratings in range (0 - 10) and store them in the array;
//get the best-rated movie/movies from the array and display the title.

    private String title;
    private int rating;

    public Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
