package com.wfruttero.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wfruttero.dsmovie.entities.Score;
import com.wfruttero.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
