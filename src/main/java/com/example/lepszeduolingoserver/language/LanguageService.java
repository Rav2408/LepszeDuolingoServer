package com.example.lepszeduolingoserver.language;

import com.example.lepszeduolingoserver.infrastructure.CycleAvoidingMappingContext;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.mapstruct.factory.Mappers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class LanguageService implements CrudService<Language, LanguageDTO, Long> {

    private final LanguageRepository languageRepository;
    private final LanguageMapper languageMapper = Mappers.getMapper(LanguageMapper.class);

    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public String getEntityName() {
        return Language.class.getName();
    }

    @Override
    public Language mapToEntity(LanguageDTO languageDTO) {
        return languageMapper.toEntity(languageDTO, new CycleAvoidingMappingContext());
    }

    @Override
    public LanguageDTO mapToDto(Language entity) {
        return languageMapper.toDto(entity, new CycleAvoidingMappingContext());
    }

    @Override
    public JpaRepository<Language, Long> getRepo() {
        return languageRepository;
    }
}
