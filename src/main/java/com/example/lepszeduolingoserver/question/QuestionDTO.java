package com.example.lepszeduolingoserver.question;

import com.example.lepszeduolingoserver.collection.CollectionDTO;
import com.example.lepszeduolingoserver.infrastructure.Identifiable;
import com.example.lepszeduolingoserver.translation.TranslationDTO;
import com.example.lepszeduolingoserver.word.Word;

public class QuestionDTO implements Identifiable<Long> {

    private Long id;

    private String type;

    private Word word;

    private TranslationDTO translation;

    private CollectionDTO collection;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public TranslationDTO getTranslation() {
        return translation;
    }

    public void setTranslation(TranslationDTO translation) {
        this.translation = translation;
    }

    public CollectionDTO getCollection() {
        return collection;
    }

    public void setCollection(CollectionDTO collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", word=" + word +
                ", translation=" + translation +
                ", collection=" + collection +
                '}';
    }
}
