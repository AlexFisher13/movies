package com.fisher.movie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
public class Movie {
    @Id
    @GeneratedValue
    Long id;
    String title;
    LocalDate releaseDate;
    Double rating;
    Integer duration;
    @ManyToMany
    Set<Actor> actors;
}