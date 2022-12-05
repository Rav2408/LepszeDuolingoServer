package com.example.lepszeduolingoserver.score;

import com.example.lepszeduolingoserver.difficulty.DifficultyDTO;
import com.example.lepszeduolingoserver.infrastructure.Identifiable;
import com.example.lepszeduolingoserver.user.DuolingoUserDTO;

public class ScoreDTO implements Identifiable<Long> {

    private Long id;

    private int bestScore;

    private DuolingoUserDTO duolingoUser;

    private DifficultyDTO difficulty;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public int getBestScore() {
        return bestScore;
    }

    public void setBestScore(int bestScore) {
        this.bestScore = bestScore;
    }

    public DuolingoUserDTO getDuolingoUser() {
        return duolingoUser;
    }

    public void setDuolingoUser(DuolingoUserDTO duolingoUser) {
        this.duolingoUser = duolingoUser;
    }

    public DifficultyDTO getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(DifficultyDTO difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "ScoreDTO{" +
                "id=" + id +
                ", bestScore=" + bestScore +
                ", duolingoUser=" + duolingoUser +
                ", difficulty=" + difficulty +
                '}';
    }
}
