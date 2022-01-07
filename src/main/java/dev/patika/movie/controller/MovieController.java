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
        /* Bir oyuncu olacak, oynadığı filmlerin listesi*/

        Cast.builder()
                .name("Ali")
                .telNo("5555")
                .movie(Movie.builder().movieName("LookUP").genre(Genre.Action).releaseYear("2021").director("Roberto").build()).build();


        User user = User.builder().userName("abah").build();
        Movie movie =Movie.builder().movieName("Look").genre(Genre.Action).releaseYear("2022").director("Rober").build();
        Movie movie2 =Movie.builder().movieName("HIMYM").genre(Genre.Comedy).releaseYear("2012").director("William").build();

        List<Puan> puanList = new ArrayList<>();

        puanList.add(Puan.builder()
                .point(5L)
                .movie(movie)
                .build());
        puanList.add(Puan.builder()
                .point(5L)
                .movie(movie2)
                .build());
        user.setOylamalarList(puanList);

        User.builder().id(1L).oylamalarList(puanList);


        return new ResponseEntity<>(movieService.findAll(), HttpStatus.OK);
    }
/*
    @GetMapping
    public List<Course> getAll(){
        List<Course> list = new ArrayList<>();

        list.add(Course.builder().build());
        list.add(Course.builder().build());
        list.add(Course.builder().build());
        list.add(Course.builder().build());

        return list;
    }

    @PostMapping
    public Course save(){
        return Course.builder().code("").name("").build();
    }
*/
/*
Course.builder()
        .name("Java Programlama")
                .code("BM345")
                .creditScore(1)
                .instructor((Instructor) this.instructorDao.save(VisitingResearcher.VisitingResearcherBuilder()
            .fullName("Koray Güney")
                        .address("İstanbul")
                        .phoneNumber("+905554443322")
                        .hourlySalary(200.0).build())).build());

*/
    @PostMapping("/movies")
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        return new ResponseEntity<>(movieService.save(movie),HttpStatus.CREATED);
    }

    @DeleteMapping("/movies/{id}")
    public ResponseEntity<String> deleteMovieById(@PathVariable Long id){
      return new ResponseEntity<>(movieService.deleteById(id),HttpStatus.NO_CONTENT);
    }


}
