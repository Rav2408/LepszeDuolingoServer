package com.example.lepszeduolingoserver.unlockedword;

import com.example.lepszeduolingoserver.infrastructure.CycleAvoidingMappingContext;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.mapstruct.factory.Mappers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UnlockedWordService implements CrudService<UnlockedWord, UnlockedWordDTO, Long> {

    private final UnlockedWordRepository unlockedWordRepository;
    private final UnlockedWordMapper unlockedWordMapper = Mappers.getMapper(UnlockedWordMapper.class);

    public UnlockedWordService(UnlockedWordRepository unlockedWordRepository) {
        this.unlockedWordRepository = unlockedWordRepository;
    }

    @Override
    public String getEntityName() {
        return UnlockedWord.class.getName();
    }

    @Override
    public UnlockedWord mapToEntity(UnlockedWordDTO unlockedWordDTO) {
        return unlockedWordMapper.toEntity(unlockedWordDTO, new CycleAvoidingMappingContext());
    }

    @Override
    public UnlockedWordDTO mapToDto(UnlockedWord entity) {
        return unlockedWordMapper.toDto(entity, new CycleAvoidingMappingContext());
    }

    @Override
    public JpaRepository<UnlockedWord, Long> getRepo() {
        return unlockedWordRepository;
    }
}
