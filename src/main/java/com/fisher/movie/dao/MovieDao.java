package com.fisher.movie.dao;

import com.fisher.movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDao extends JpaRepository<Movie, Long> {
}
