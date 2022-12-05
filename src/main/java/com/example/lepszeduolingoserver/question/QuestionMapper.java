package com.example.lepszeduolingoserver.question;

import com.example.lepszeduolingoserver.infrastructure.SimpleMapper;
import org.mapstruct.Mapper;

@Mapper
public interface QuestionMapper extends SimpleMapper<Question, QuestionDTO> {
}
