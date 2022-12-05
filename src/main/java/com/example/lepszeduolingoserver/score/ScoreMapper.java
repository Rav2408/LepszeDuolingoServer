package com.example.lepszeduolingoserver.score;

import com.example.lepszeduolingoserver.infrastructure.SimpleMapper;
import org.mapstruct.Mapper;

@Mapper
public interface ScoreMapper extends SimpleMapper<Score, ScoreDTO> {
}
