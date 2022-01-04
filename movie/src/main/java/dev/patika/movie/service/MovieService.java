package dev.patika.movie.service;


import dev.patika.movie.dao.MovieDao;
import dev.patika.movie.entity.Movie;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service
public class MovieService implements BaseService<Movie>{

    private  MovieDao movieDao;

    @Override
    public List<Movie> findAll() {
        return movieDao.findAll();
    }

    @Override
    public Movie findById(Long id) {
        return  movieDao.findById(id).get();
    }

    @Override
    public Movie save(Movie object) {
        return movieDao.save(object);
    }

    @Override
    public String deleteById(Long id) {
        movieDao.deleteById(id);
        return id+"silindi";
    }

    @Override
    public Movie update(Movie object) {
        return  movieDao.save(object);
    }
}
