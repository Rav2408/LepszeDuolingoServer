package com.example.lepszeduolingoserver.difficulty;

import jakarta.validation.constraints.NotNull;

public class DifficultyDTO {

    private Long id;

    private String level;

    public DifficultyDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "DifficultyDTO{" +
                "id=" + id +
                ", level='" + level + '\'' +
                '}';
    }
}
