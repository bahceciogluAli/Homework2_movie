package dev.patika.movie.entity;
import dev.patika.movie.entity.enumaration.Genre;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieid;
    private String movieName;
    private Genre genre;
    private String releaseYear;
    private String director;
   @OneToMany(mappedBy = "movie")
    private List<Cast> cast;
   @OneToMany
    List<Puan> oylamalarList;
    @ManyToMany
    List<Watchlist> watchlist;


}
