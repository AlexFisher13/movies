package com.fisher.movie.controller;

import com.fisher.movie.dao.MovieDao;
import com.fisher.movie.model.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController {
    public final MovieDao movieDao;

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movieDao.findAll();
    }
}
