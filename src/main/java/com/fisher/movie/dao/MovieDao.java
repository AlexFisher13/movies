package com.fisher.movie.dao;

import com.fisher.movie.model.Actor;
import com.fisher.movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieDao extends JpaRepository<Movie, Long> {
    List<Movie> findMovieByActorsContaining(Actor actor);


    @Query("select m.title " +
            "from Movie m " +
            "join m.actors a " +
            "where a.name like :name")
    List<String> findMoviesWithActor(String name);

    @Query("from Movie " +
            "where id=:id")
    Movie findMovieById(Integer id);
}
