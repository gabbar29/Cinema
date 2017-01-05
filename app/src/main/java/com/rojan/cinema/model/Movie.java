package com.rojan.cinema.model;

/**
 * Created by DELL PC on 12/27/2016.
 */
public class Movie {

    public String title;
    public String image;
    public String date;
    public String type;

    public Movie() {
    }

    public Movie(String title, String image, String date, String type) {
        this.title = title;
        this.image = image;
        this.date = date;
        this.type = type;
    }
}
