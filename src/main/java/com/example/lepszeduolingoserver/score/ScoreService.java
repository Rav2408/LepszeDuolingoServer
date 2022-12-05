package com.example.lepszeduolingoserver.score;

import com.example.lepszeduolingoserver.infrastructure.CycleAvoidingMappingContext;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.mapstruct.factory.Mappers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ScoreService implements CrudService<Score, ScoreDTO, Long> {

    private final ScoreRepository scoreRepository;
    private final ScoreMapper scoreMapper = Mappers.getMapper(ScoreMapper.class);

    public ScoreService(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    @Override
    public String getEntityName() {
        return Score.class.getName();
    }

    @Override
    public Score mapToEntity(ScoreDTO scoreDTO) {
        return scoreMapper.toEntity(scoreDTO, new CycleAvoidingMappingContext());
    }

    @Override
    public ScoreDTO mapToDto(Score entity) {
        return scoreMapper.toDto(entity, new CycleAvoidingMappingContext());
    }

    @Override
    public JpaRepository<Score, Long> getRepo() {
        return scoreRepository;
    }
}
