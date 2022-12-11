package com.example.lepszeduolingoserver.unlockedword;

import com.example.lepszeduolingoserver.infrastructure.Identifiable;
import com.example.lepszeduolingoserver.user.DuolingoUser;
import com.example.lepszeduolingoserver.word.Word;
import jakarta.persistence.*;

@Entity
@Table
public class UnlockedWord implements Identifiable<Long> {
    @Id
    @SequenceGenerator(name = "unlocked_word_sequence", sequenceName = "unlocked_word_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "unlocked_word_sequence")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "word_id")
    private Word word;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "duolingouser_id")
    private DuolingoUser duolingoUser;

    public UnlockedWord(Long id, Word word, DuolingoUser duolingoUser) {
        this.id = id;
        this.word = word;
        this.duolingoUser = duolingoUser;
    }

    public UnlockedWord() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public DuolingoUser getDuolingoUser() {
        return duolingoUser;
    }

    public void setDuolingoUser(DuolingoUser duolingoUser) {
        this.duolingoUser = duolingoUser;
    }
}
