package com.movielibrary.moviecasestudy.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Movie {

    @Id
    private String movieId;
    private String movieName;
    private double movieCollection;

    public Movie(String movieId, String movieName, double movieCollection) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieCollection = movieCollection;
    }


    private double fromMovieCollection;
    private double toMovieCollection;
}

