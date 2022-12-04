package com.example.lepszeduolingoserver.score;

import com.example.lepszeduolingoserver.difficulty.Difficulty;
import com.example.lepszeduolingoserver.infrastructure.Identifiable;
import com.example.lepszeduolingoserver.user.DuolingoUser;
import jakarta.persistence.*;

@Entity
@Table
public class Score implements Identifiable<Long> {
    @Id
    @SequenceGenerator(name = "example_sequence", sequenceName = "example_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "example_sequence")
    private Long id;

    private int bestScore;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "duolingouser_id")
    private DuolingoUser duolingoUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "difficulty_id")
    private Difficulty difficulty;

    public Score(Long id, int bestScore, DuolingoUser duolingoUser, Difficulty difficulty) {
        this.id = id;
        this.bestScore = bestScore;
        this.duolingoUser = duolingoUser;
        this.difficulty = difficulty;
    }

    public Score() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBestScore() {
        return bestScore;
    }

    public void setBestScore(int bestScore) {
        this.bestScore = bestScore;
    }

    public DuolingoUser getDuolingoUser() {
        return duolingoUser;
    }

    public void setDuolingoUser(DuolingoUser duolingoUser) {
        this.duolingoUser = duolingoUser;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
}
