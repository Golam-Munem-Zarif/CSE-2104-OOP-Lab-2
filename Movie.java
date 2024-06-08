package com.mycompany.movie;

public class Movie {
    String title;
    String genre;
    String leadActor;
    String director;
    int releaseYear;
    double rating;
    String review;

    public Movie(String title, String genre, String leadActor, String director, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        if (this.rating < 5) {
            this.review = "Not Good";
        } else {
            this.review = "Good";
        }
    }

    public void display() {
        System.out.println("Title: " + this.title + ",\nGenre: " + this.genre + ",\nLead Actor: " + this.leadActor + ",\nDirector: " + this.director + ",\nYear: " + this.releaseYear + ",\nRating: " + this.rating + ",\nReview: " + this.review);
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("Interstellar", "Sci-Fi", "Matthew McConaughey", "Christopher Nolan", 2014, 8.6);
        m1.display();
        System.out.println();

        Movie m2 = new Movie("Avengers: Endgame", "Action", "Robert Downey Jr.", "Anthony and Joe Russo", 2019, 8.4);
        m2.display();
    }

}