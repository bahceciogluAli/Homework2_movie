package dev.patika.movie.service;

import java.util.List;

public interface BaseService<T> {
    List<T> findAll();
    T findById(Long id);
    T save(T object);
    String deleteById(Long id);
    T update(T object);

}
