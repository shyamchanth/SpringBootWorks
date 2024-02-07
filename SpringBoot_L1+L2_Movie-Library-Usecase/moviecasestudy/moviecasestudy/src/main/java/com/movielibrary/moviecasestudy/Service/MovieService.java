package com.movielibrary.moviecasestudy.Service;

import com.movielibrary.moviecasestudy.Model.Movie;
import com.movielibrary.moviecasestudy.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAllMovieDetails() {
        return movieRepository.findAll();
    }

    public Movie registerMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie findByMovieId(String movieId) {
        return movieRepository.findAllByMovieId(movieId);


    }

    public List<Movie> findByMovieName(String movieName) {
        return movieRepository.searchByMovieName(movieName);
    }

    public List<Movie> findMovieByCollection(double fromMovieCollection, double toMovieCollection) {

        return movieRepository.findByMovieCollectionBetween(fromMovieCollection, toMovieCollection);
    }


}
