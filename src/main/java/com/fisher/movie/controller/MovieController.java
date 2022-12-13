package com.fisher.movie.controller;

import com.fisher.movie.dao.ActorDao;
import com.fisher.movie.dao.MovieDao;
import com.fisher.movie.model.Actor;
import com.fisher.movie.model.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class MovieController {
    public final MovieDao movieDao;
    public final ActorDao actorDao;

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movieDao.findAll();
    }

    @GetMapping("/moviesWithActor")
    public List<String> getMoviesWithActor(@RequestParam String actorName) {
        Actor actor = actorDao.findActorsByName(actorName);
        return movieDao.findMovieByActorsContaining(actor).stream()
                .map(Movie::getTitle).collect(Collectors.toList());
    }

    @GetMapping("/moviesWithActor2")
    public List<String> findMoviesWithActor(@RequestParam String actorName) {
        return movieDao.findMoviesWithActor(actorName);
    }

    @GetMapping("/findMovieById")
    public Movie findMovieById(@RequestParam Integer id) {
        return movieDao.findMovieById(id);
    }

}
