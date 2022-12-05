package com.example.lepszeduolingoserver.difficulty;

import com.example.lepszeduolingoserver.infrastructure.CycleAvoidingMappingContext;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.mapstruct.factory.Mappers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DifficultyService implements CrudService<Difficulty, DifficultyDTO, Long> {
    private final DifficultyRepository difficultyRepository;
    private final DifficultyMapper difficultyMapper = Mappers.getMapper(DifficultyMapper.class);

    public DifficultyService(DifficultyRepository difficultyRepository) {
        this.difficultyRepository = difficultyRepository;
    }

    @Override
    public String getEntityName() {
        return Difficulty.class.getName();
    }

    @Override
    public Difficulty mapToEntity(DifficultyDTO difficultyDTO) {
        return difficultyMapper.toEntity(difficultyDTO, new CycleAvoidingMappingContext());
    }

    @Override
    public DifficultyDTO mapToDto(Difficulty entity) {
        return difficultyMapper.toDto(entity, new CycleAvoidingMappingContext());
    }

    @Override
    public JpaRepository<Difficulty, Long> getRepo() {
        return difficultyRepository;
    }
}
