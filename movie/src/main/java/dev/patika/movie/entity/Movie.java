package dev.patika.movie.entity;
import dev.patika.movie.entity.enumaration.Genre;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String moviName;
    private Genre genre;
    private Date releaseYear;
    private String director;
    private List<String> cast;


}
