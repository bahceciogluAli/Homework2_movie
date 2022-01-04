package dev.patika.movie.controller;

import dev.patika.movie.entity.Movie;
import dev.patika.movie.service.MovieService;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api")
public class MovieController {
    private final MovieService movieService;

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> findAll(){

        return new ResponseEntity<>(movieService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        return new ResponseEntity<>(movieService.save(movie),HttpStatus.CREATED);
    }

    @DeleteMapping("/movies/{id}")
    public ResponseEntity<String> deleteMovieById(@PathVariable Long id){
      return new ResponseEntity<>(movieService.deleteById(id),HttpStatus.NO_CONTENT);
    }


}
