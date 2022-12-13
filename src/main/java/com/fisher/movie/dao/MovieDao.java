package com.fisher.movie.dao;

import com.fisher.movie.model.Actor;
import com.fisher.movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieDao extends JpaRepository<Movie, Long> {
    List<Movie> findMovieByActorsContaining(Actor actor);
}
