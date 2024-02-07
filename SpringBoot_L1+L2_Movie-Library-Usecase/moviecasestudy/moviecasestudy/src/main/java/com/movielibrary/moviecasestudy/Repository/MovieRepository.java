package com.movielibrary.moviecasestudy.Repository;

import com.movielibrary.moviecasestudy.Model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie,String> {


    Movie findAllByMovieId(String movieId);

    @Query("SELECT p FROM Movie p WHERE CONCAT(p.movieName) LIKE %?1%")
    List<Movie> searchByMovieName(String movieName);


    List<Movie> findByMovieCollectionBetween(double fromMovieCollection, double toMovieCollection);
}
