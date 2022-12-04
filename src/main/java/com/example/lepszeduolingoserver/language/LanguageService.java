package com.example.lepszeduolingoserver.language;

import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

public class LanguageService implements CrudService<Language, LanguageDTO, Long> {

    @Override
    public String getEntityName() {
        return null;
    }

    @Override
    public Language mapToEntity(LanguageDTO languageDTO) {
        return null;
    }

    @Override
    public LanguageDTO mapToDto(Language entity) {
        return null;
    }

    @Override
    public JpaRepository<Language, Long> getRepo() {
        return null;
    }
}
