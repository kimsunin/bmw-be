package com.bmw.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Score {
    @Id
    @GeneratedValue
    @Column
    protected Long id;

    @Column
    protected String name;

    @Column
    protected Integer score;

    @Column
    protected String createdDate;

    public Score(String name, Integer score, String createdDate){
        this.name = name;
        this.score = score;
        this.createdDate = createdDate;
    }
}
