package com.example.lepszeduolingoserver.unlockedword;

import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

public class UnlockedWordService implements CrudService<UnlockedWord, UnlockedWordDTO, Long> {
    @Override
    public String getEntityName() {
        return null;
    }

    @Override
    public UnlockedWord mapToEntity(UnlockedWordDTO unlockedWordDTO) {
        return null;
    }

    @Override
    public UnlockedWordDTO mapToDto(UnlockedWord entity) {
        return null;
    }

    @Override
    public JpaRepository<UnlockedWord, Long> getRepo() {
        return null;
    }
}
