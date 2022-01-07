package dev.patika.movie.entity;

import javax.persistence.ManyToOne;

public class Watchlist {
    @ManyToOne
    User userid;
    private String watchListName;
    @ManyToOne
    Movie movieid;
}
