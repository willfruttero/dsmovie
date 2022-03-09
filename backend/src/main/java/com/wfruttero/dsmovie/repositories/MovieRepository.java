package com.wfruttero.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wfruttero.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
