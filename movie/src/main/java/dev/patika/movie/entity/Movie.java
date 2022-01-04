package dev.patika.movie.entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import dev.patika.movie.entity.enumaration.Genre;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
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
    private Long id;
    private String movieName;
    private Genre genre;
    private Date releaseYear;
    private String director;
   @OneToMany(mappedBy = "movie")
    private List<Cast> cast;


}
