package com.bmw.service;

import com.bmw.dto.ReturnDto;
import com.bmw.dto.UpdateScoreDto;
import com.bmw.entity.Score;
import com.bmw.repository.ScoreRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    public ReturnDto getScore(){
        List<Score> scores = scoreRepository.findAll();

        return new ReturnDto(200, "score list", scores);
    }

    public ReturnDto updateScore(UpdateScoreDto updateScoreDto) {

        List<Score> scores = scoreRepository.findAll();

        Score minScore;

        minScore = scores.getFirst();

        for (Score score : scores) {
            if (score.getScore() < minScore.getScore()) {
                minScore = score;
            }
        }

        if (updateScoreDto.getScore() > minScore.getScore()) {
            scoreRepository.deleteById(minScore.getId());
            Score saved = scoreRepository.save(updateScoreDto.toEntity());
            return new ReturnDto(200, "score updated", saved);
        } else {
            return new ReturnDto(400, "score short");
        }

    }
}
