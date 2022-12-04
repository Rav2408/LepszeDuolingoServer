package com.example.lepszeduolingoserver.difficulty;

import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

public class DifficultyService implements CrudService<Difficulty, DifficultyDTO, Long> {
    @Override
    public String getEntityName() {
        return null;
    }

    @Override
    public Difficulty mapToEntity(DifficultyDTO difficultyDTO) {
        return null;
    }

    @Override
    public DifficultyDTO mapToDto(Difficulty entity) {
        return null;
    }

    @Override
    public JpaRepository<Difficulty, Long> getRepo() {
        return null;
    }
}
