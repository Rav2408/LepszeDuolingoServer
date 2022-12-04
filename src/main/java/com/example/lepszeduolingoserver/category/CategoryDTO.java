package com.example.lepszeduolingoserver.category;

import com.example.lepszeduolingoserver.difficulty.DifficultyDTO;

public class CategoryDTO {

    private Long id;

    private String name;

    private DifficultyDTO difficulty;

    public CategoryDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DifficultyDTO getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(DifficultyDTO difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", difficulty=" + difficulty +
                '}';
    }
}
