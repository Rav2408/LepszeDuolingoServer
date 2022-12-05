package com.example.lepszeduolingoserver.word;


import com.example.lepszeduolingoserver.difficulty.Difficulty;
import com.example.lepszeduolingoserver.infrastructure.Identifiable;
import com.example.lepszeduolingoserver.language.Language;
import jakarta.persistence.*;

@Entity
@Table
public class Word implements Identifiable<Long> {

    @Id
    @SequenceGenerator(name = "word_sequence", sequenceName = "word_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "word_sequence")
    private Long id;

    private String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "language_id")
    private Language language;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "difficulty_id")
    private Difficulty difficulty;

    private String imagePath;

    public Word(Long id, String text, Language language, Difficulty difficulty, String imagePath) {
        this.id = id;
        this.text = text;
        this.language = language;
        this.difficulty = difficulty;
        this.imagePath = imagePath;
    }

    public Word() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}