package com.example.lepszeduolingoserver.translation;

import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

public class TranslationService implements CrudService<Translation, TranslationDTO, Long> {
    @Override
    public String getEntityName() {
        return null;
    }

    @Override
    public Translation mapToEntity(TranslationDTO translationDTO) {
        return null;
    }

    @Override
    public TranslationDTO mapToDto(Translation entity) {
        return null;
    }

    @Override
    public JpaRepository<Translation, Long> getRepo() {
        return null;
    }
}
