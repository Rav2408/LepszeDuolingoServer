package com.example.lepszeduolingoserver.translation;

import com.example.lepszeduolingoserver.infrastructure.SimpleMapper;
import org.mapstruct.Mapper;

@Mapper
public interface TranslationMapper extends SimpleMapper<Translation, TranslationDTO> {
}
