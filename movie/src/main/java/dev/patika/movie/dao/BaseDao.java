package dev.patika.movie.dao;


import java.util.List;

public interface BaseDao<T> {
     List<T> findAll();
    T findById(String id);
    T save(T object);
    void deleteById(int id);
    T update(T object);
}
