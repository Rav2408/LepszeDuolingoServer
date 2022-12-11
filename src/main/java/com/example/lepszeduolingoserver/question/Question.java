package com.example.lepszeduolingoserver.question;

import com.example.lepszeduolingoserver.collection.Collection;
import com.example.lepszeduolingoserver.infrastructure.Identifiable;
import com.example.lepszeduolingoserver.translation.Translation;
import com.example.lepszeduolingoserver.word.Word;
import jakarta.persistence.*;

@Entity
@Table
public class Question implements Identifiable<Long> {

    @Id
    @SequenceGenerator(name = "question_sequence", sequenceName = "question_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question_sequence")
    private Long id;

    private String type;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "word_id")
    private Word word;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "translation_id")
    private Translation translation;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "collection_id")
    private Collection collection;

    public Question(Long id, String type, Word word, Translation translation, Collection collection) {
        this.id = id;
        this.type = type;
        this.word = word;
        this.translation = translation;
        this.collection = collection;
    }

    public Question() {

    }

    public Long getId() {
        return id;
    }

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

    public Translation getTranslation() {
        return translation;
    }

    public void setTranslation(Translation translation) {
        this.translation = translation;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }
}
