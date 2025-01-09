package com.bmw.repository;

import com.bmw.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, Long> {
    Score save(Score score);

    List<Score> findAll();

    void deleteById(Long id);
}
