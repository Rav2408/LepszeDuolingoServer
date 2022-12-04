package com.example.lepszeduolingoserver.word;

import com.example.lepszeduolingoserver.infrastructure.SimpleMapper;
import org.mapstruct.Mapper;

@Mapper
public interface WordMapper extends SimpleMapper<Word, WordDTO> {
}
