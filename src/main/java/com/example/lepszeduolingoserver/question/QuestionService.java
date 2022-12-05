package com.example.lepszeduolingoserver.question;

import com.example.lepszeduolingoserver.infrastructure.CycleAvoidingMappingContext;
import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.mapstruct.factory.Mappers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class QuestionService implements CrudService<Question, QuestionDTO, Long> {

    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper = Mappers.getMapper(QuestionMapper.class);

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public String getEntityName() {
        return Question.class.getName();
    }

    @Override
    public Question mapToEntity(QuestionDTO questionDTO) {
        return questionMapper.toEntity(questionDTO, new CycleAvoidingMappingContext());
    }

    @Override
    public QuestionDTO mapToDto(Question entity) {
        return questionMapper.toDto(entity, new CycleAvoidingMappingContext());
    }

    @Override
    public JpaRepository<Question, Long> getRepo() {
        return questionRepository;
    }
}
