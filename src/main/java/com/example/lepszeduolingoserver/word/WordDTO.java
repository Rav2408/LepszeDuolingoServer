package com.example.lepszeduolingoserver.word;

import com.example.lepszeduolingoserver.difficulty.Difficulty;
import com.example.lepszeduolingoserver.difficulty.DifficultyDTO;
import com.example.lepszeduolingoserver.infrastructure.Identifiable;
import com.example.lepszeduolingoserver.language.Language;
import com.example.lepszeduolingoserver.language.LanguageDTO;

public class WordDTO implements Identifiable<Long> {

    private Long id;
    private String text;
    private LanguageDTO language;
    private DifficultyDTO difficulty;
    private String imagePath;

    public WordDTO() {
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LanguageDTO getLanguage() {
        return language;
    }

    public void setLanguage(LanguageDTO language) {
        this.language = language;
    }

    public DifficultyDTO getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(DifficultyDTO difficulty) {
        this.difficulty = difficulty;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "WordDTO{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", language=" + language +
                ", difficulty=" + difficulty +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }
}
