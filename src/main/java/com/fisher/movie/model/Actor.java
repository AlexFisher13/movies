package com.fisher.movie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Actor {
    @Id
    @GeneratedValue
    Long id;
    String name;
    LocalDate birth;
}
