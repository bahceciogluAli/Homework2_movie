package dev.patika.movie.entity;
import dev.patika.movie.entity.enumaration.Genre;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
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
  //  @ManyToOne(mappedBy="cast")
   // private List<String> cast;


}
