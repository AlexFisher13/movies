package com.fisher.movie.dao;

import com.fisher.movie.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorDao extends JpaRepository<Actor, Long> {
    Actor findActorsByName(String name);
}
