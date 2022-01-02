package dev.patika.movie.service;


import dev.patika.movie.dao.MovieDao;
import dev.patika.movie.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieService implements BaseService<Movie>{

    private  MovieDao movieDao;

    @Override
    public List<Movie> findAll() {
        return movieDao.findAll();
    }

    @Override
    public Movie findById(String id) {
        return movieDao.findById(id);
    }

    @Override
    public Movie save(Movie object) {
        return (Movie) movieDao.save(object);
    }

    @Override
    public void deleteById(int id) {
        movieDao.deleteById(id);
    }

    @Override
    public Movie update(Movie object) {
        return (Movie) movieDao.update(object);
    }
}
