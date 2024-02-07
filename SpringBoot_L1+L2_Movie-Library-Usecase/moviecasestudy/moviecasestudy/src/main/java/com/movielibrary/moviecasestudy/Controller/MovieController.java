package com.movielibrary.moviecasestudy.Controller;

import com.movielibrary.moviecasestudy.Model.Movie;
import com.movielibrary.moviecasestudy.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MovieController {
    @Autowired
    MovieService movieService;


    //AdminRight(FirstLogin) - Home,Add

    @GetMapping("/home")
    public String getAllMovieDetails(Model model) {
        List<Movie> movies = movieService.getAllMovieDetails();
        model.addAttribute("movieList", movies);
        return "index";
    }

    @GetMapping("/addMovie")
    public String registerMovieDetails(Model model) {
        Movie movie = new Movie();
        model.addAttribute("movie", movie);
        return "addmoviedetails";
    }

    @PostMapping("/movie/post")
    public String addMovieDetails(Movie movie, Model model) {
        Movie moviesRegister = movieService.registerMovie(movie);
        model.addAttribute("movieList", moviesRegister);
        return "redirect:/home";
    }

    @GetMapping("/updateMovie")
    public String updateMovieDetails(Model model) {
        return "updatemoviedetails";
    }


    //UserRights - Home,Filter By MovieId,MovieName,MovieCollections
    @GetMapping("/home/user")
    public String getAllMovieDetailsUser(Model model) {
        List<Movie> movies = movieService.getAllMovieDetails();
        model.addAttribute("movieList", movies);
        return "indexUser";
    }

    @GetMapping("/searchById")
    public String getMovieUsingId(Model model, @Param("movieId") String movieId) {

        Movie movieSearchId=movieService.findByMovieId(movieId);
        if(movieSearchId!=null) {
            model.addAttribute("movieById", movieSearchId);
            model.addAttribute("movieId", movieId);
            return "searchedById";
        }
        else
        {
            return "notFound";
        }


    }

    @GetMapping("/searchByName")
    public String searchByMovieName(Model model, String movieName) {
        List<Movie> moviesListByName = movieService.findByMovieName(movieName);

        if(!moviesListByName.isEmpty()) {
            model.addAttribute("movieByName", moviesListByName);
            model.addAttribute("movieName", movieName);

            return "searchedByName";
        }
        else
        {
            return "notFound";
        }


    }

    @GetMapping("/searchByCollection")
    public String searchByCollection(Model model, double fromMovieCollection, double toMovieCollection) {
        List<Movie> moviesByCollection = movieService.findMovieByCollection(fromMovieCollection, toMovieCollection);

        if(!moviesByCollection.isEmpty()) {
            model.addAttribute("moviesCollection", moviesByCollection);
            model.addAttribute("fromCollection", fromMovieCollection);
            model.addAttribute("toCollection", toMovieCollection);

            return "searchedByCollection";
        }
        else {
            return "notFound";
        }
    }


}


