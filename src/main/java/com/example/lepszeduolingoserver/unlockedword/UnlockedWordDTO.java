package com.example.lepszeduolingoserver.unlockedword;

import com.example.lepszeduolingoserver.infrastructure.Identifiable;
import com.example.lepszeduolingoserver.user.DuolingoUser;
import com.example.lepszeduolingoserver.user.DuolingoUserDTO;
import com.example.lepszeduolingoserver.word.Word;
import com.example.lepszeduolingoserver.word.WordDTO;

public class UnlockedWordDTO implements Identifiable<Long> {

    private Long id;
    private WordDTO word;
    private DuolingoUserDTO duolingoUser;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public WordDTO getWord() {
        return word;
    }

    public void setWord(WordDTO word) {
        this.word = word;
    }

    public DuolingoUserDTO getDuolingoUser() {
        return duolingoUser;
    }

    public void setDuolingoUser(DuolingoUserDTO duolingoUser) {
        this.duolingoUser = duolingoUser;
    }

    @Override
    public String toString() {
        return "UnlockedWordDTO{" +
                "id=" + id +
                ", word=" + word +
                ", duolingoUser=" + duolingoUser +
                '}';
    }
}
