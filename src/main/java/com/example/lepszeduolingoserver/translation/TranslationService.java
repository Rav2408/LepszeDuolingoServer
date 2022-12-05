package com.example.lepszeduolingoserver.translation;

import com.example.lepszeduolingoserver.infrastructure.CycleAvoidingMappingContext;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.mapstruct.factory.Mappers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TranslationService implements CrudService<Translation, TranslationDTO, Long> {

    private final TranslationRepository translationRepository;
    private final TranslationMapper translationMapper = Mappers.getMapper(TranslationMapper.class);

    public TranslationService(TranslationRepository translationRepository) {
        this.translationRepository = translationRepository;
    }

    @Override
    public String getEntityName() {
        return Translation.class.getName();
    }

    @Override
    public Translation mapToEntity(TranslationDTO translationDTO) {
        return translationMapper.toEntity(translationDTO, new CycleAvoidingMappingContext());
    }

    @Override
    public TranslationDTO mapToDto(Translation entity) {
        return translationMapper.toDto(entity, new CycleAvoidingMappingContext());
    }

    @Override
    public JpaRepository<Translation, Long> getRepo() {
        return translationRepository;
    }
}
