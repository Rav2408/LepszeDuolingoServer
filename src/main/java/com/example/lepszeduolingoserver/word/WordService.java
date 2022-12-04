package com.example.lepszeduolingoserver.word;

import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

public class WordService implements CrudService<Word, WordDTO, Long> {
    @Override
    public String getEntityName() {
        return null;
    }

    @Override
    public Word mapToEntity(WordDTO wordDTO) {
        return null;
    }

    @Override
    public WordDTO mapToDto(Word entity) {
        return null;
    }

    @Override
    public JpaRepository<Word, Long> getRepo() {
        return null;
    }
}
