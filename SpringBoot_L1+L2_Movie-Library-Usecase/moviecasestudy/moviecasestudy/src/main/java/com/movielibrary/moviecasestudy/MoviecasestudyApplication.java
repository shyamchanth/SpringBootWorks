package com.movielibrary.moviecasestudy;

import com.movielibrary.moviecasestudy.Model.Movie;
import com.movielibrary.moviecasestudy.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviecasestudyApplication {


    public static void main(String[] args) {
        SpringApplication.run(MoviecasestudyApplication.class, args);
    }
}

//Directly giving Data's

//implements CommandLineRunner
//	@Override
//	public void run(String... args) throws Exception {
//
//		Movie movie1= new Movie("M101","Shark",2000000);
//		Movie movie2= new Movie("M102","The Miracle",60000);
//		Movie movie3= new Movie("M103","BlueWale",300000);
//		Movie movie4= new Movie("M104","Dolphin",10000);
//       movieRepository.save(movie1);
//		movieRepository.save(movie2);
//		movieRepository.save(movie3);
//		movieRepository.save(movie4);
//
//
//
//	}
//@Autowired
//MovieRepository movieRepository;



