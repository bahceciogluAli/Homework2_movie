package dev.patika.movie.dao;

import dev.patika.movie.entity.Movie;

import javax.transaction.Transactional;
import java.util.List;

public class MovieDaoImp implements MovieDao<Movie> {
    @Override
    public List<Movie> findAll() {
        return null;
    }

    @Override
    public Movie findById(String id) {
        return null;
    }

    @Override
    @Transactional
    public Movie save(Movie object) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    @Transactional
    public Movie update(Movie object) {
        return null;
    }
}
