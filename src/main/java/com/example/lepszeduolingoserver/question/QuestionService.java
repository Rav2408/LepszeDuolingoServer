package com.example.lepszeduolingoserver.question;

import com.example.lepszeduolingoserver.infrastructure.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

public class QuestionService implements CrudService<Question, QuestionDTO, Long> {
    @Override
    public String getEntityName() {
        return null;
    }

    @Override
    public Question mapToEntity(QuestionDTO questionDTO) {
        return null;
    }

    @Override
    public QuestionDTO mapToDto(Question entity) {
        return null;
    }

    @Override
    public JpaRepository<Question, Long> getRepo() {
        return null;
    }
}
