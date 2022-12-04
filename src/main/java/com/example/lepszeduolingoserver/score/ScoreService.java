package com.example.lepszeduolingoserver.score;

import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

public class ScoreService implements CrudService<Score, ScoreDTO, Long> {
    @Override
    public String getEntityName() {
        return null;
    }

    @Override
    public Score mapToEntity(ScoreDTO scoreDTO) {
        return null;
    }

    @Override
    public ScoreDTO mapToDto(Score entity) {
        return null;
    }

    @Override
    public JpaRepository<Score, Long> getRepo() {
        return null;
    }
}
