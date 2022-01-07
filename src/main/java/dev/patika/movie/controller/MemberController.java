package dev.patika.movie.controller;

import dev.patika.movie.entity.Movie;
import dev.patika.movie.entity.Puan;
import dev.patika.movie.entity.User;
import dev.patika.movie.entity.Watchlist;
import dev.patika.movie.entity.enumaration.Genre;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/member")
public class MemberController {

    @PostMapping("/puan")
    public ResponseEntity<Puan> puanMovie(@RequestParam Long memberid,@RequestParam Long point,@RequestParam Long movieid){

        User user=User.builder().memberid(memberid).userName("aliB").build();
        Movie movie=Movie.builder().movieid(movieid).movieName("kuzgunlar").director("director").genre(Genre.Action).releaseYear("2015").build();
        Puan puan=Puan.builder().movie(movie).user(user).point(point).build();
        return new ResponseEntity<>(puan, HttpStatus.OK);
    }

    @PostMapping("/watchlist")
    public ResponseEntity<Watchlist> addWatchList(@RequestParam Long memberid,@RequestParam String watchListName){

        User user=User.builder().memberid(memberid).userName("aliB").build();
        Watchlist watchlist=Watchlist.builder().watchListName(watchListName).user(user).build();

      return new ResponseEntity<>(watchlist, HttpStatus.OK);
    }


    @PostMapping("/addMoviewatchlist")
    public ResponseEntity<Watchlist> addM(@RequestParam Long movieid,@RequestParam Long watchListid){


        Movie movie =Movie.builder().movieid(movieid).movieName("Look").genre(Genre.Action).releaseYear("2022").director("Rober").build();
         List<Movie> list=new ArrayList<>();
        list.add(movie);

        Watchlist watchlist=Watchlist.builder().watchListName("izlemeListem").movielist(list).build();

        return new ResponseEntity<>(watchlist, HttpStatus.OK);
    }
}
