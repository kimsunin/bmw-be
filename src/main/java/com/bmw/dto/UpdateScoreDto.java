package com.bmw.dto;

import com.bmw.entity.Score;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UpdateScoreDto {
    private String name;

    private Integer score;

    private String createdDate;

    public Score toEntity(){
        return new Score(this.name, this.score, this.createdDate);
    }
}
