package com.bmw.controller;

import com.bmw.dto.ReturnDto;
import com.bmw.dto.UpdateScoreDto;
import com.bmw.service.ScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @GetMapping
    public ReturnDto getScore(){
        return scoreService.getScore();
    }

    @PostMapping("/update")
    public ReturnDto updateScore(@RequestBody UpdateScoreDto updateScoreDto){
        log.info(updateScoreDto.toString());

        return scoreService.updateScore(updateScoreDto);
    }
}
