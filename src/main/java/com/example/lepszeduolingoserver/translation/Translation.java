package com.example.lepszeduolingoserver.translation;

import com.example.lepszeduolingoserver.infrastructure.Identifiable;
import com.example.lepszeduolingoserver.language.Language;
import com.example.lepszeduolingoserver.word.Word;
import jakarta.persistence.*;

@Entity
@Table
public class Translation implements Identifiable<Long> {
    @Id
    @SequenceGenerator(name = "translation_sequence", sequenceName = "translation_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "translation_sequence")
    private Long id;


    private String translationText;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "language_id")
    private Language language;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "word_id")
    private Word word;

    public Translation(Long id, String translationText, Language language, Word word) {
        this.id = id;
        this.translationText = translationText;
        this.language = language;
        this.word = word;
    }

    public Translation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTranslationText() {
        return translationText;
    }

    public void setTranslationText(String translationText) {
        this.translationText = translationText;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }
}
