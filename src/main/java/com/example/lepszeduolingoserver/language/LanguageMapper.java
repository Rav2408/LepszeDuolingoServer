package com.example.lepszeduolingoserver.language;

import com.example.lepszeduolingoserver.infrastructure.SimpleMapper;
import org.mapstruct.Mapper;

@Mapper
public interface LanguageMapper extends SimpleMapper<Language, LanguageDTO> {
}
