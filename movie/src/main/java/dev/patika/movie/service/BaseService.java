package dev.patika.movie.service;

import java.util.List;

public interface BaseService<T> {
    List<T> findAll();
    T findById(String id);
    T save(T object);
    void deleteById(int id);
    T update(T object);

}
