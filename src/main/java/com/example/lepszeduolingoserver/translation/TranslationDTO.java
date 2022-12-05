package com.example.lepszeduolingoserver.translation;

import com.example.lepszeduolingoserver.infrastructure.Identifiable;
import com.example.lepszeduolingoserver.language.Language;
import com.example.lepszeduolingoserver.language.LanguageDTO;
import com.example.lepszeduolingoserver.word.Word;
import com.example.lepszeduolingoserver.word.WordDTO;

public class TranslationDTO implements Identifiable<Long> {

    private Long id;
    private String translationText;
    private LanguageDTO language;
    private WordDTO word;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getTranslationText() {
        return translationText;
    }

    public void setTranslationText(String translationText) {
        this.translationText = translationText;
    }

    public LanguageDTO getLanguage() {
        return language;
    }

    public void setLanguage(LanguageDTO language) {
        this.language = language;
    }

    public WordDTO getWord() {
        return word;
    }

    public void setWord(WordDTO word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "TranslationDTO{" +
                "id=" + id +
                ", translationText='" + translationText + '\'' +
                ", language=" + language +
                ", word=" + word +
                '}';
    }
}
