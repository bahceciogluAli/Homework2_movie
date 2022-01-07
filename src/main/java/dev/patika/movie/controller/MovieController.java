package dev.patika.movie.controller;

import dev.patika.movie.entity.Cast;
import dev.patika.movie.entity.Movie;
import dev.patika.movie.entity.Puan;
import dev.patika.movie.entity.User;
import dev.patika.movie.entity.enumaration.Genre;
import dev.patika.movie.service.MovieService;
import lombok.AllArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api")
public class MovieController {
    private final MovieService movieService;

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> findAll(){

        Movie movie =Movie.builder().movieName("Look").genre(Genre.Action).releaseYear("2022").director("Rober").build();
        Movie movie2 =Movie.builder().movieName("HIMYM").genre(Genre.Comedy).releaseYear("2012").director("William").build();
        List<Movie> list=new ArrayList<>();
        list.add(movie);
        list.add(movie2);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){

        Movie moviedmmy =Movie.builder().movieName(movie.getMovieName()).genre(movie.getGenre()).releaseYear(movie.getReleaseYear()).director(movie.getDirector()).build();

        return new ResponseEntity<>(moviedmmy,HttpStatus.CREATED);
    }

    @DeleteMapping("/movies/{id}")
    public ResponseEntity<String> deleteMovieById(@PathVariable Long id){
      return new ResponseEntity<>(movieService.deleteById(id),HttpStatus.NO_CONTENT);
    }


}
