package dev.patika.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Puan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long point;

    @ManyToOne
    @JoinColumn(name = "member_id", referencedColumnName = "memberid")
    private User user;

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "movieid")
    private Movie movie;

}
