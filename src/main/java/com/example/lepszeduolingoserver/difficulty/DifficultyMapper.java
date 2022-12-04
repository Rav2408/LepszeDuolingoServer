package com.example.lepszeduolingoserver.difficulty;

import com.example.lepszeduolingoserver.infrastructure.SimpleMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DifficultyMapper extends SimpleMapper<Difficulty, DifficultyDTO> {
//
//    DifficultyMapper INSTANCE = Mappers.getMapper( DifficultyMapper.class );
//
//    DifficultyDTO difficultyToDifficultyDto(Difficulty difficulty);
}
