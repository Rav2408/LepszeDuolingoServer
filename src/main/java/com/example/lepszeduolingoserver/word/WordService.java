package com.example.lepszeduolingoserver.word;

import com.example.lepszeduolingoserver.infrastructure.CycleAvoidingMappingContext;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.mapstruct.factory.Mappers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class WordService implements CrudService<Word, WordDTO, Long> {

    private final WordRepository wordRepository;
    private final WordMapper wordMapper = Mappers.getMapper(WordMapper.class);

    public WordService(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @Override
    public String getEntityName() {
        return Word.class.getName();
    }

    @Override
    public Word mapToEntity(WordDTO wordDTO) {
        return wordMapper.toEntity(wordDTO, new CycleAvoidingMappingContext());
    }

    @Override
    public WordDTO mapToDto(Word entity) {
        return wordMapper.toDto(entity, new CycleAvoidingMappingContext());
    }

    @Override
    public JpaRepository<Word, Long> getRepo() {
        return wordRepository;
    }
}
